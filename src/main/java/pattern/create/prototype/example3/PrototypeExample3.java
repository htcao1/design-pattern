package pattern.create.prototype.example3;

import pattern.create.prototype.example3.equip.Armor;
import pattern.create.prototype.example3.equip.Sword;
import pattern.create.prototype.example3.player.Player;

import java.io.IOException;

public class PrototypeExample3 {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Player player = new Player("巧巧");
        player.setSword(new Sword("龙渊剑"));
        player.setArmor(new Armor("青云甲"));

        // 浅克隆，不会复制关联对象
        Player playerClone = player.clone();
        System.out.println("【浅克隆】的玩家为：" + playerClone.getName());
        System.out.println("是否为同一把龙渊剑：" + (player.getSword() == playerClone.getSword())); // 判定内存地址是否一致
        System.out.println("是否为同一副青云甲：" + (player.getArmor() == playerClone.getArmor())); // 判定内存地址是否一致
        System.out.println();

        // 深度克隆，会复制关联对象
        Player playerDeepClone = player.deepClone();
        System.out.println("【深度克隆】的玩家为：" + playerDeepClone.getName());
        System.out.println("是否为同一把龙渊剑：" + (player.getSword() == playerDeepClone.getSword())); // 判定内存地址是否一致
        System.out.println("是否为同一副青云甲：" + (player.getArmor() == playerDeepClone.getArmor())); // 判定内存地址是否一致
    }
}
