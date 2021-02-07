package pattern.behavior.state.state;

import pattern.behavior.state.player.Player;

/** 攻击状态 */
public class AttackState implements IState {
    @Override
    public void doAction(Player player) {
        System.out.println(player.getName() + " 攻击 ...");
    }
}
