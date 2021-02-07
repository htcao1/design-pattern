package pattern.behavior.state.command;

import pattern.behavior.state.player.Player;
import pattern.behavior.state.state.EState;

/** 命令：待命 */
public class StandCommand implements ICommand {
    private Player player;

    public StandCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.setState(EState.STAND);
    }
}