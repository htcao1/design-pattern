package pattern.behavior.state.command;

import pattern.behavior.state.player.Player;
import pattern.behavior.state.state.EState;

/** 命令：移动 */
public class MoveCommand implements ICommand {
    private Player player;

    public MoveCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.setState(EState.MOVE);
    }
}
