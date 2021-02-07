package pattern.behavior.interpreter;

import pattern.behavior.interpreter.expression.AndExpression;
import pattern.behavior.interpreter.expression.Expression;
import pattern.behavior.interpreter.expression.OrExpression;
import pattern.behavior.interpreter.expression.TerminalExpression;

/**
 * 解释器模式
 */
public class InterpreterExample {
    /** 规则：Robert 和 John 是男性*/
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    /** 规则2：Julie 是一个已婚的女性*/
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }
}
