package pattern.structure.facade;

import pattern.structure.facade.facade.ShapeFacade;

public class FacadeExample {
    public static void main(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacade();

        shapeFacade.drawCircle();
        shapeFacade.drawRectangle();
        shapeFacade.drawSquare();
    }
}
