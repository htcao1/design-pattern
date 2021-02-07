package pattern.structure.bridge.draw;


/**
 * 红色圆形绘制
 */
public class RedCircleDraw implements IDraw {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
