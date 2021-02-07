package pattern.create.prototype.example3.equip;

import java.io.Serializable;

/**
 * 剑
 */
public class Sword implements Serializable {
    private String name;

    public Sword(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
