package pattern.behavior.command.command;

import pattern.behavior.command.player.Player;

/** 命令：攻击 */
public class AttackCommand implements ICommand {
    private Player player;

    public AttackCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.attack();
    }
}