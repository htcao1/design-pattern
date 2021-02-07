package pattern.behavior.visitor.part;

import pattern.behavior.visitor.visitor.IComputerPartVisitor;

/** 电脑部件 */
public interface IComputerPart {
    public void accept(IComputerPartVisitor computerPartVisitor);
}
