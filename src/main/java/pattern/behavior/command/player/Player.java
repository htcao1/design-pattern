package pattern.behavior.command.player;

/** 玩家 */
public class Player {
    public void move(){
        System.out.println("玩家移动 ...");
    }

    public void attack() {
        System.out.println("玩家攻击 ...");
    }

    public void stand() {
        System.out.println("玩家待命 ...");
    }
}
