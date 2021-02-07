package pattern.behavior.visitor.visitor;

import pattern.behavior.visitor.part.Computer;
import pattern.behavior.visitor.part.Keyboard;
import pattern.behavior.visitor.part.Monitor;
import pattern.behavior.visitor.part.Mouse;

public interface IComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
