package pattern.create.abstractfactory.example2.boss;

/**
 * BOSS接口
 */
public interface IBoss {
    /**
     * 咆哮
     */
    void roar();

    /**
     * 获取Boss类型
     */
    String getType();
}
