package pattern.create.builder.example2.item.base;

import pattern.create.builder.example2.packing.Bottle;
import pattern.create.builder.example2.packing.base.IPacking;

/**
 * 饮料
 */
public abstract class AbstractDrink implements IItem {

    /**
     * 瓶装
     */
    @Override
    public IPacking packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
