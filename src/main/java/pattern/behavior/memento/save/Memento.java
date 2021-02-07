package pattern.behavior.memento.save;

/** 玩家存档 */
public class Memento {
    // 用json格式的字符串来保留玩家信息
    private String record;

    public Memento(String state){
        this.record = state;
        System.out.println("存档：" + state);
    }

    public String getRecord(){
        return record;
    }
}
