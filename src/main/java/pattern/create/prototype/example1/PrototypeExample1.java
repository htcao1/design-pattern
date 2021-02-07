package pattern.create.prototype.example1;

public class PrototypeExample1 {

    public static void main(String[] args) {
        Player player = new Player();
        player.setName("巧巧");
        Player playerCopy = (Player) player.clone();

        System.out.println("克隆出的玩家为：" + playerCopy.getName());
    }
}

/**
 * 玩家
 */
class Player implements Cloneable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}