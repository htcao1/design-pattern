package pattern.create.singleton;

/**
 * 单例模式 6.枚举，这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。
 * 是否延迟初始化：否
 * 是否多线程安全：是
 */
public enum Singleton6 {
    INSTANCE;

    public void whateverMethod() {
    }
}

