package pattern.create.builder.example2.packing;

import pattern.create.builder.example2.packing.base.IPacking;

/**
 * 打包方式 - 瓶装
 */
public class Bottle implements IPacking {

    @Override
    public String pack() {
        return "瓶装";
    }
}
