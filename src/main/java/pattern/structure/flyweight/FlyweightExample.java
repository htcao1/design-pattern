package pattern.structure.flyweight;

import pattern.structure.flyweight.shape.Circle;
import pattern.structure.flyweight.shape.CircleFactory;

/**
 * 享元模式：产出不同颜色的圆形（对象池）
 */
public class FlyweightExample {
    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            Circle circle =
                    (Circle) CircleFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
