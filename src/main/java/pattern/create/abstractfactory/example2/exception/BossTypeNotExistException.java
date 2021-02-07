package pattern.create.abstractfactory.example2.exception;

public class BossTypeNotExistException extends Exception {
    private static final long serialVersionUID = 2510964693810636125L;
    private String info;

    public BossTypeNotExistException(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "BOSS类型不存在, MonsterType=" + this.info;
    }
}
