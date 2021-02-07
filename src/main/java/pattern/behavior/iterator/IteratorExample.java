package pattern.behavior.iterator;

import pattern.behavior.iterator.base.Iterator;
import pattern.behavior.iterator.repository.ResRepository;

/** 迭代器例子 */
public class IteratorExample {
    public static void main(String[] args) {
        ResRepository namesRepository = new ResRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("资源名：" + name);
        }
    }
}
