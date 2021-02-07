package pattern.create.builder.example2.item;

import pattern.create.builder.example2.item.base.AbstractBurger;

/**
 * 鸡肉汉堡包
 */
public class ChickenBurger extends AbstractBurger {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "鸡肉汉堡包";
    }
}