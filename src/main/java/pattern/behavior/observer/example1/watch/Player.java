package pattern.behavior.observer.example1.watch;

import java.util.Observable;

/** 玩家（被观察者） */
public class Player extends Observable {
    // 玩家生命值
    private int hp = 100;

    public int getHp() {
        return hp;
    }

    public void setHp(int value) {
        if(this.hp != value){
            this.hp = value;
            // 设置状态，如果无此设置，观察者不会执行update方法
            setChanged();
            // 有变化，才通知观察者
            notifyObservers();
        }
    }
}

