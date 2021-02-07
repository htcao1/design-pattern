package pattern.behavior.iterator.base;

/** 迭代器接口 */
public interface Iterator {
    /** 是否有下一个元素 */
    public boolean hasNext();
    /** 移动到下个元素 */
    public Object next();
}
