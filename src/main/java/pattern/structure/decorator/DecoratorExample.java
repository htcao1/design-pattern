package pattern.structure.decorator;

import pattern.structure.decorator.base.IWukong;
import pattern.structure.decorator.change.Bird;
import pattern.structure.decorator.change.Fish;
import pattern.structure.decorator.role.WuKong;

/**
 * 例.装饰器模式 - 实际案例：孙悟空72变
 */
public class DecoratorExample {
    public static void main(String[] args) {
        // 孙悟空
        IWukong wukong = new WuKong();
        wukong.move();
        // 变鸟
        IWukong bird = new Bird(wukong);
        bird.move();
        ((Bird) bird).fly(); // 飞行，是新变化带来的行为，超出了IWukong，所以要向下转型
        // 变鱼
        IWukong fish = new Fish(bird);
        fish.move();
        ((Fish) fish).swim(); // 游泳，是新变化带来的行为，超出了IWukong，所以要向下转型
    }
}

