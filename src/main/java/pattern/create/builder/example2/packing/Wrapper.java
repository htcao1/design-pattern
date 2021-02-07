package pattern.create.builder.example2.packing;

import pattern.create.builder.example2.packing.base.IPacking;

/**
 * 打包方式 - 纸盒装
 */
public class Wrapper implements IPacking {

    @Override
    public String pack() {
        return "纸盒装";
    }
}
