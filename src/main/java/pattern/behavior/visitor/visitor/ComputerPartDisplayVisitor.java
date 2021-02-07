package pattern.behavior.visitor.visitor;

import pattern.behavior.visitor.part.Computer;
import pattern.behavior.visitor.part.Keyboard;
import pattern.behavior.visitor.part.Monitor;
import pattern.behavior.visitor.part.Mouse;

/**
 * 访问者（多态实现）
 */
public class ComputerPartDisplayVisitor implements IComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}