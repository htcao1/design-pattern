package pattern.structure.bridge.draw;

/**
 * 绿色圆形绘制
 */
public class GreenCircleDraw implements IDraw {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
