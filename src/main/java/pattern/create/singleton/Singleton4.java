package pattern.create.singleton;

/**
 * 单例模式 4.双检锁/双重校验锁（DCL，即 double-checked locking），实现较复杂，但性能最高
 * 是否延迟初始化：是
 * 是否多线程安全：是
 */
public class Singleton4 {
    private volatile static Singleton4 singleton;

    private Singleton4() {
    }

    public static Singleton4 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton4.class) {
                if (singleton == null) {
                    singleton = new Singleton4();
                }
            }
        }
        return singleton;
    }
}


