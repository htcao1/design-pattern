package pattern.create.abstractfactory.example2.exception;

public class MonsterTypeNotExistException extends Exception {
    private static final long serialVersionUID = -66199287557918311L;
    private String info;

    public MonsterTypeNotExistException(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "怪物类型不存在, MonsterType=" + this.info;
    }
}
