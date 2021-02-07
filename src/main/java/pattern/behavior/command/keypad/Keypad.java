package pattern.behavior.command.keypad;

import pattern.behavior.command.command.ICommand;

/** 键盘 */
public class Keypad {
    private ICommand moveCommand;
    private ICommand attackCommand;
    private ICommand standCommand;

    public void setMoveCommand(ICommand moveCommand) {
        this.moveCommand = moveCommand;
    }
    public void setAttackCommand(ICommand attackCommand) {
        this.attackCommand = attackCommand;
    }
    public void setStandCommand(ICommand standCommand) {
        this.standCommand = standCommand;
    }
    /** 移动 */
    public void move(){
        moveCommand.execute();
    }
    /** 攻击 */
    public void attack(){
        attackCommand.execute();
    }
    /** 待命 */
    public void stand(){
        standCommand.execute();
    }
}
