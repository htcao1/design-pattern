package pattern.behavior.observer.example2;

import pattern.behavior.observer.example2.watch.Moniter;
import pattern.behavior.observer.example2.watch.Player;

import java.util.Observer;

/**
 * 观察者模式：例子2.玩家生命变化，用java.beans.PropertyChangeXXX实现
 */
public class ObserverExample2 {
    public static void main(String[] args) {
        //创建被观察者对象
        Player player = new Player(999);
        //创建观察者对象，并将被观察者对象登记
        Moniter moniter1 = new Moniter(1, player);
        Moniter moniter2 = new Moniter(2, player);
        //给被观察者状态赋值
        player.setHp(90);
        player.setHp(80);
        player.setHp(70);
    }
}
