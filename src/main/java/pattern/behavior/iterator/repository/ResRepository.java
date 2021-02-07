package pattern.behavior.iterator.repository;

import pattern.behavior.iterator.base.Container;
import pattern.behavior.iterator.base.Iterator;

/** 游戏中的资源容器 */
public class ResRepository implements Container {

    public String[] names = {"金币", "木材" , "粮食" ,"铁锭"};

    @Override
    public Iterator getIterator() {
        return new ResIterator(names);
    }
}
