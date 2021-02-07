package pattern.behavior.command.command;

import pattern.behavior.command.player.Player;

/** 命令：移动 */
public class MoveCommand implements ICommand {
    private Player player;

    public MoveCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.move();
    }
}
