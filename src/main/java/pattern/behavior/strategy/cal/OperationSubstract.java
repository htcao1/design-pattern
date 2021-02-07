package pattern.behavior.strategy.cal;

/** 操作：减 */
public class OperationSubstract implements ICal{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
