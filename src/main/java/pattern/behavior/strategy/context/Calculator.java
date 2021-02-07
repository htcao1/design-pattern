package pattern.behavior.strategy.context;

import pattern.behavior.strategy.cal.ICal;

/**
 * 计算器
 */
public class Calculator {
    /** 算法策略 */
    private ICal iCal;

    public Calculator(ICal iCal){
        this.iCal = iCal;
    }

    public int execute(int num1, int num2){
        return iCal.doOperation(num1, num2);
    }
}
