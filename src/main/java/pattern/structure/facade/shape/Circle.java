package pattern.structure.facade.shape;

public class Circle implements IShape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
