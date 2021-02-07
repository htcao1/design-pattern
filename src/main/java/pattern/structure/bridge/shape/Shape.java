package pattern.structure.bridge.shape;

import pattern.structure.bridge.draw.IDraw;

/**
 * 使用 IDraw 接口创建抽象类 Shape
 */
public abstract class Shape {
    protected IDraw iDraw;
    protected Shape(IDraw drawAPI){
        this.iDraw = drawAPI;
    }
    public abstract void draw();
}
