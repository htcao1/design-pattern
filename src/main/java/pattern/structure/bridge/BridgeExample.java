package pattern.structure.bridge;

import pattern.structure.bridge.shape.Circle;
import pattern.structure.bridge.draw.GreenCircleDraw;
import pattern.structure.bridge.draw.RedCircleDraw;
import pattern.structure.bridge.shape.Shape;

/**
 * 桥接模式
 */
public class BridgeExample {
    public static void main(String[] args) {
        // 桥接接口RedCircle，完成了具体的绘制实现
        Shape redCircle = new Circle(100, 100, 10, new RedCircleDraw());
        // 桥接接口GreenCircle，完成了具体的绘制实现
        Shape greenCircle = new Circle(200, 200, 20, new GreenCircleDraw());

        redCircle.draw();
        greenCircle.draw();
    }
}
