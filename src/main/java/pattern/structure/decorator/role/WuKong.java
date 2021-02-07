package pattern.structure.decorator.role;

import pattern.structure.decorator.base.IWukong;

/**
 * 悟空-人形态
 */
public class WuKong implements IWukong {
    @Override
    public void move() {
        System.out.println("WuKong Move");
    }
}
