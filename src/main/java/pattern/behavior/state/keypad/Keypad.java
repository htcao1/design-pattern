package pattern.behavior.state.keypad;

import pattern.behavior.state.command.ICommand;

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
        System.out.println("==> 键盘按下【移动】键");
        moveCommand.execute();
    }
    /** 攻击 */
    public void attack(){
        System.out.println("==> 键盘按下【攻击】键");
        attackCommand.execute();
    }
    /** 待命 */
    public void stand(){
        System.out.println("==> 键盘按下【待命】键");
        standCommand.execute();
    }
}
