package pattern.structure.flyweight.shape;

import java.util.HashMap;

/**
 * 圆形工厂
 */
public class CircleFactory {
    private static final HashMap<String, Circle> circleMap = new HashMap<>();

    public static Circle getCircle(String color) {
        Circle circle = circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
