package pattern.structure.facade.shape;

public class Square implements IShape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
