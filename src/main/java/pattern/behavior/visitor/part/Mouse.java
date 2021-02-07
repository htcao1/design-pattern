package pattern.behavior.visitor.part;

import pattern.behavior.visitor.visitor.IComputerPartVisitor;

public class Mouse implements IComputerPart {

    @Override
    public void accept(IComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
