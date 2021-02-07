package pattern.behavior.command.command;

import pattern.behavior.command.player.Player;

/** 命令：待命 */
public class StandCommand implements ICommand {
    private Player player;

    public StandCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.stand();
    }
}