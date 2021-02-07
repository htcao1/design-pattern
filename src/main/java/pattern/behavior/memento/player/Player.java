package pattern.behavior.memento.player;

import com.alibaba.fastjson.JSONObject;
import pattern.behavior.memento.save.Memento;

/**
 * 玩家
 */
public class Player {
    /**
     * 等级
     */
    private int level;
    /**
     * 所在地图ID
     */
    private int mapId;
    /**
     * 坐标X
     */
    private int x;
    /**
     * 坐标Y
     */
    private int y;

    public Player() {
        this.level = 1;
        this.mapId = 1;
        this.x = 10;
        this.y = 50;
    }

    /** 转化为存档 */
    public String saveToStorage() {
        return JSONObject.toJSONString(this);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMapId() {
        return mapId;
    }

    public void setMapId(int mapId) {
        this.mapId = mapId;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


}
