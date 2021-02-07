package pattern.behavior.state.state;

import pattern.behavior.state.player.Player;

/** 状态接口 */
public interface IState {
    /** 执行 */
    public void doAction(Player player);
}
