package pattern.behavior.memento.save;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/** 存储器 */
public class Storage {
    private List<Memento> mementoList = new ArrayList<Memento>();

    /** 加入新存档 */
    public void add(String record){
        mementoList.add(new Memento(record));
    }

    /** 获取存档 */
    public Memento get(int index){
        return mementoList.get(index);
    }
}
