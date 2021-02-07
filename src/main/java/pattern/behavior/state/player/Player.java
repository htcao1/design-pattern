package pattern.behavior.state.player;

import pattern.behavior.state.state.EState;
import pattern.behavior.state.state.IState;

/**
 * 玩家
 */
public class Player {
    /** 名字 */
    private String name;
    /** 状态 */
    private EState state;

    public Player(String name){
        this.name = name;
        this.state = EState.STAND; // 设置初始状态
    }

    public void setState(EState state) {
        this.state = state;
    }

    public EState getState() {
        return this.state;
    }

    public String getName(){
        return this.name;
    }
}
