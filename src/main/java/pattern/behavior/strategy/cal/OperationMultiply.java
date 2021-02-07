package pattern.behavior.strategy.cal;

/** 操作：乘 */
public class OperationMultiply implements ICal{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
