package pattern.create.singleton;

/**
 * 单例模式 2.懒汉式，线程安全，由于最外层方法加锁，效率很低
 * 是否延迟初始化：是
 * 是否多线程安全：是
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}

