package pattern.create.factory.example2.exception;

/**
 * 自定义异常-怪物类型不存在
 */
public class MonsterTypeNotExistException extends Exception {

    private static final long serialVersionUID = 1L;

    private String info;

    public MonsterTypeNotExistException(String info) {

        this.info = info;
    }

    @Override
    public String toString() {

        return "怪物类型不存在, MonsterType=" + this.info;
    }
}
