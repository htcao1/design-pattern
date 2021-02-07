package pattern.behavior.state.state;

/** 枚举：状态 */
public enum EState {
    STAND(1, "待命"), MOVE(2, "移动"), ATTACK(3, "攻击");

    private int type;
    private String state;

    EState(int type, String state) {
        this.type = type;
        this.state = state;
    }
}

