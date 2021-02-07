package pattern.behavior.observer.example1.watch;

import java.util.Observable;
import java.util.Observer;

/** 显示器（观察者，并完成了功能显示） */
public class Moniter implements Observer {

    public Moniter(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("[显示器] 玩家生命值：" + ((Player) o).getHp());
    }
}

