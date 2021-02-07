package pattern.behavior.visitor.part;

import pattern.behavior.visitor.visitor.IComputerPartVisitor;

public class Computer implements IComputerPart {

    IComputerPart[] parts;

    public Computer(){
        parts = new IComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(IComputerPartVisitor computerPartVisitor) {
        // 各个子部件的访问
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        // 自身的访问
        computerPartVisitor.visit(this);
    }
}