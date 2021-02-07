package pattern.create.builder.example2.item;

import pattern.create.builder.example2.item.base.AbstractBurger;

/**
 * 蔬菜汉堡包
 */
public class VegBurger extends AbstractBurger {

    @Override
    public float price() {
        return 20.0f;
    }

    @Override
    public String name() {
        return "蔬菜汉堡包";
    }
}
