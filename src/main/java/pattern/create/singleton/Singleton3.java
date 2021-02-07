package pattern.create.singleton;

/**
 * 单例模式 3.饿汉式，类加载时就初始化，会耗一些内存和增加启动时间
 * 是否延迟初始化：否
 * 是否多线程安全：是
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return instance;
    }
}

