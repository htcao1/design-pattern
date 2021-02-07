package pattern.create.builder.example2.item.base;

import pattern.create.builder.example2.packing.base.IPacking;
import pattern.create.builder.example2.packing.Wrapper;

/**
 * 汉堡包
 */
public abstract class AbstractBurger implements IItem {

    /**
     * 纸盒装
     */
    @Override
    public IPacking packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
