package pattern.behavior.strategy;

import pattern.behavior.strategy.cal.OperationAdd;
import pattern.behavior.strategy.cal.OperationMultiply;
import pattern.behavior.strategy.cal.OperationSubstract;
import pattern.behavior.strategy.context.Calculator;

/**
 * 策略模式：简单计算器
 */
public class StrategyExample {
    public static void main(String[] args) {
        // 加
        Calculator calculator = new Calculator(new OperationAdd());
        System.out.println("10 + 5 = " + calculator.execute(10, 5));
        // 减
        calculator = new Calculator(new OperationSubstract());
        System.out.println("10 - 5 = " + calculator.execute(10, 5));
        // 乘
        calculator = new Calculator(new OperationMultiply());
        System.out.println("10 * 5 = " + calculator.execute(10, 5));
    }
}
