package pattern.structure.decorator.change;

import pattern.structure.decorator.base.IWukong;
import pattern.structure.decorator.decorator.ChangeDecorator;

/**
 * 72变之变鱼
 */
public class Fish extends ChangeDecorator {
    public Fish(IWukong wk) {
        super(wk);
    }

    @Override
    public void move() {
        System.out.println("Fish Move");
    }

    /**
     * 游泳
     */
    public void swim() {
        System.out.println("Fish Swim");
    }
}
