package pattern.create.singleton;

/**
 * 单例模式 5.登记式/静态内部类，这种方式能达到双检锁方式一样的功效，但实现更简单。（可替换第4种方式）
 * 是否延迟初始化：是
 * 是否多线程安全：是
 */
public class Singleton5 {
    /**
     * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载。
     */
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5() {
    }

    public static final Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

