package pattern.create.prototype.example2.player;

import pattern.create.prototype.example2.equip.Armor;
import pattern.create.prototype.example2.equip.Sword;

/**
 * 玩家
 */
public class Player implements Cloneable {
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

    @Override
    public Player clone() throws CloneNotSupportedException {
        return (Player) super.clone();
    }
}
