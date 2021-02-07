package pattern.behavior.memento;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import pattern.behavior.memento.player.Player;
import pattern.behavior.memento.save.Memento;
import pattern.behavior.memento.save.Storage;

/**
 * 备忘录模式：玩家存档
 */
public class MementoExample {
    public static void main(String[] args) {
        Player player = new Player();
        Storage storage = new Storage();

        player.setLevel(5);
        player.setMapId(2);
        player.setX(100);
        player.setY(120);
        // 存档0
        storage.add(player.saveToStorage());

        player.setLevel(24);
        player.setMapId(6);
        player.setX(200);
        player.setY(150);
        // 存档1
        storage.add(player.saveToStorage());

        System.out.println("玩家下线完毕");
        System.out.println();

        // 读取0号存档
        int recordIndex = 1;
        System.out.println("玩家上线，开始读档" + recordIndex);
        Memento memento = storage.get(recordIndex);
        Player p = JSON.parseObject(memento.getRecord(), new TypeReference<Player>(){});
        System.out.println("玩家信息：{level:" + p.getLevel() + ", mapId:" + p.getMapId() + ", x:" + p.getX() + ", y:" + p.getY() + "}");
    }
}
