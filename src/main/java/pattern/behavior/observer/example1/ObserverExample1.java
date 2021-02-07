package pattern.behavior.observer.example1;

import pattern.behavior.observer.example1.watch.Player;
import pattern.behavior.observer.example1.watch.Moniter;

import java.util.Observer;

/**
 * 观察者模式，例子1：玩家生命值变化
 */
public class ObserverExample1 {
    public static void main(String[] args) {
        //创建被观察者对象
        Player watched = new Player();
        //创建观察者对象，并将被观察者对象登记
        Observer watcher = new Moniter(watched);
        //给被观察者状态赋值
        watched.setHp(90);
        watched.setHp(80);
        watched.setHp(70);
    }
}
