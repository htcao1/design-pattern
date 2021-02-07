package pattern.behavior.state.state;

import pattern.behavior.state.player.Player;

/** 待命状态 */
public class StandState implements IState {
    @Override
    public void doAction(Player player) {
        System.out.println(player.getName() + " 待命 ...");
    }
}
