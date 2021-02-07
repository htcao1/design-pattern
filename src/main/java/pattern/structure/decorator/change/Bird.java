package pattern.structure.decorator.change;

import pattern.structure.decorator.base.IWukong;
import pattern.structure.decorator.decorator.ChangeDecorator;

/**
 * 72变之变鸟
 */
public class Bird extends ChangeDecorator {
    public Bird(IWukong wk) {
        super(wk);
    }

    @Override
    public void move() {
        System.out.println("Bird Move");
    }

    /**
     * 飞行
     */
    public void fly() {
        System.out.println("Bird Fly");
    }
}

