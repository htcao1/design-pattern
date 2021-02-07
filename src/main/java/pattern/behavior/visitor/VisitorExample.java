package pattern.behavior.visitor;

import pattern.behavior.visitor.part.Computer;
import pattern.behavior.visitor.part.IComputerPart;
import pattern.behavior.visitor.visitor.ComputerPartDisplayVisitor;

/**
 * 访问者模式：电脑部件
 */
public class VisitorExample {
    public static void main(String[] args) {
        IComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
