package pattern.structure.bridge.shape;

import pattern.structure.bridge.draw.IDraw;
import pattern.structure.bridge.shape.Shape;
import pattern.structure.bridge.draw.IDraw;

/**
 * 圆形
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, IDraw iDraw) {
        super(iDraw);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        iDraw.drawCircle(radius, x, y);
    }
}

