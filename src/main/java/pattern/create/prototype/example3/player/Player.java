package pattern.create.prototype.example3.player;

import pattern.create.prototype.example3.equip.Armor;
import pattern.create.prototype.example3.equip.Sword;

import java.io.*;

/**
 * 玩家
 */
public class Player implements Cloneable, Serializable {
    private String name; // 名字
    private Sword sword; // 剑
    private Armor armor; // 盔甲

    public Player(String name) {
        this.name = name;
    }

    public Sword getSword() {
        return sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public String getName() {
        return this.name;
    }

    // 浅克隆
    @Override
    public Player clone() throws CloneNotSupportedException {
        return (Player) super.clone();
    }

    /**
     * 深度克隆
     */
    public Player deepClone() throws IOException, ClassNotFoundException {
        //将对象写到流里
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //从流里读回来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (Player) ois.readObject();
    }
}
