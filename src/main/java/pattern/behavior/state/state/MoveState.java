package pattern.behavior.state.state;

import pattern.behavior.state.player.Player;

/** 移动状态 */
public class MoveState implements IState {
    @Override
    public void doAction(Player player) {
        System.out.println(player.getName() + " 移动 ...");
    }
}
