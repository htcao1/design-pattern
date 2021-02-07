package pattern.create.abstractfactory.example2.monster;

/**
 * 怪物接口
 */
public interface IMonster {
    /**
     * 说
     */
    void say();

    /**
     * 获取怪物类型
     */
    String getType();
}
