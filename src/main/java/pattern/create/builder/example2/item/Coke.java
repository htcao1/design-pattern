package pattern.create.builder.example2.item;

import pattern.create.builder.example2.item.base.AbstractDrink;

/**
 * 可口可乐
 */
public class Coke extends AbstractDrink {

    @Override
    public float price() {
        return 10.0f;
    }

    @Override
    public String name() {
        return "可口可乐";
    }
}
