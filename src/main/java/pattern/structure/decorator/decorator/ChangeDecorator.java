package pattern.structure.decorator.decorator;

import pattern.structure.decorator.base.IWukong;

/**
 * 变化（装饰器）
 */
public class ChangeDecorator implements IWukong {
    private IWukong wukong;

    public ChangeDecorator(IWukong ds) {
        this.wukong = ds;
    }

    @Override
    public void move() {
        this.wukong.move();
    }
}

