package pattern.structure.facade.facade;

import pattern.structure.facade.shape.Circle;
import pattern.structure.facade.shape.IShape;
import pattern.structure.facade.shape.Rectangle;
import pattern.structure.facade.shape.Square;

/**
 * 图形的外观模式
 */
public class ShapeFacade {
    private IShape circle;
    private IShape rectangle;
    private IShape square;

    public ShapeFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
