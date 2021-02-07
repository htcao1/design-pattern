package pattern.create.prototype.example3.equip;

import java.io.Serializable;

/**
 * 盔甲
 */
public class Armor implements Serializable {
    private String name;

    public Armor(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
