package pattern.create.builder.example2.item.base;

import pattern.create.builder.example2.packing.base.IPacking;

/**
 * 物品接口
 */
public interface IItem {
    /**
     * 商品名
     */
    public String name();

    /**
     * 打包方式
     */
    public IPacking packing();

    /**
     * 价格
     */
    public float price();
}
