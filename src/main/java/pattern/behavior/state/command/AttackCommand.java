package pattern.behavior.state.command;

import pattern.behavior.state.player.Player;
import pattern.behavior.state.state.EState;

/** 命令：攻击 */
public class AttackCommand implements ICommand {
    private Player player;

    public AttackCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.setState(EState.ATTACK);
    }
}