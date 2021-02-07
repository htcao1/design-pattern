package pattern.create.builder.example2.item;

import pattern.create.builder.example2.item.base.AbstractDrink;

/**
 * 咖啡
 */
public class Coffee extends AbstractDrink {

    @Override
    public float price() {
        return 15.0f;
    }

    @Override
    public String name() {
        return "咖啡";
    }
}