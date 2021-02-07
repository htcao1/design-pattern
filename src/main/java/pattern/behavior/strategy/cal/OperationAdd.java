package pattern.behavior.strategy.cal;

/** 操作：加 */
public class OperationAdd implements ICal {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
