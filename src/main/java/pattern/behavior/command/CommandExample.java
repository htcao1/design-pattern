package pattern.behavior.command;

import pattern.behavior.command.command.AttackCommand;
import pattern.behavior.command.command.ICommand;
import pattern.behavior.command.command.MoveCommand;
import pattern.behavior.command.command.StandCommand;
import pattern.behavior.command.keypad.Keypad;
import pattern.behavior.command.player.Player;

/**
 * 命令模式：键盘控制玩家行为
 */
public class CommandExample {
    public static void main(String[] args) {
        // 创建接收者对象（玩家）
        Player player = new Player();
        // 创建命令对象
        ICommand moveCommand = new MoveCommand(player);
        ICommand attackCommand = new AttackCommand(player);
        ICommand standCommand = new StandCommand(player);
        // 绑定键盘命令
        Keypad keypad = new Keypad();
        keypad.setMoveCommand(moveCommand);
        keypad.setAttackCommand(attackCommand);
        keypad.setStandCommand(standCommand);
        //按下键盘测试
        keypad.move();
        keypad.attack();
        keypad.stand();
        keypad.attack();
        keypad.stand();
    }
}
