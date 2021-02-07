package pattern.behavior.state;

import pattern.behavior.state.command.AttackCommand;
import pattern.behavior.state.command.ICommand;
import pattern.behavior.state.command.MoveCommand;
import pattern.behavior.state.command.StandCommand;
import pattern.behavior.state.keypad.Keypad;
import pattern.behavior.state.player.Player;
import pattern.behavior.state.state.*;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * 状态模式：键盘控制玩家行为- 玩家状态机
 */
public class StateExample {
    public static void main(String[] args) {
        // 创建接收者对象（玩家）
        Player player = new Player("叶辰");
        // 创建命令对象
        ICommand moveCommand = new MoveCommand(player);
        ICommand attackCommand = new AttackCommand(player);
        ICommand standCommand = new StandCommand(player);
        // 绑定键盘命令
        Keypad keypad = new Keypad();
        keypad.setMoveCommand(moveCommand);
        keypad.setAttackCommand(attackCommand);
        keypad.setStandCommand(standCommand);

        // 键盘线程 - 模拟用户随机按下键盘
        new Thread(){
            @Override
            public void run() {
                Random random = new Random();
                while (true){
                    int rd = random.nextInt(3);
                    switch (rd){
                        case 0:
                            keypad.stand();
                            break;
                        case 1:
                            keypad.move();
                            break;
                        case 2:
                            keypad.attack();
                            break;
                    }
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        // 玩家线程 - 监测状态机
        new Thread(){
            @Override
            public void run() {
                while(true){
                    EState state = player.getState();
                    switch (state){
                        case STAND:
                            new StandState().doAction(player);
                            break;
                        case MOVE:
                            new MoveState().doAction(player);
                            break;
                        case ATTACK:
                            new AttackState().doAction(player);
                            break;
                    }

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
