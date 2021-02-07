package pattern.behavior.iterator.repository;

import pattern.behavior.iterator.base.Iterator;

/** 资源迭代器 */
public class ResIterator implements Iterator {
    private String[] resNames;
    private int index; // 游标

    public ResIterator(String[] names) {
        this.resNames = names;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (this.index < this.resNames.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return this.resNames[index++];
        }
        return null;
    }
}
