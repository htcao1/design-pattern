package pattern.behavior.observer.example2.watch;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * 玩家（被观察者）
 */
public class Player {
    // 编号
    private int id;
    // 玩家生命值
    private int hp = 100;
    // 观察者列表
    protected PropertyChangeSupport listeners = new PropertyChangeSupport(this);

    public Player(int id){
        this.id = id;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int value) {
        if (this.hp != value) {
            // 有变化，通知观察者
            firePropertyChange("Player" + this.id, this.hp, value);
            this.hp = value;
        }
    }
    /** 添加观察者 */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        listeners.addPropertyChangeListener(listener);
    }
    /** 通知属性变化 */
    public void firePropertyChange(String propName, Object oldValue, Object newValue) {
        listeners.firePropertyChange(propName, oldValue, newValue);
    }

    /**
     * 移除观察者
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        listeners.removePropertyChangeListener(listener);
    }
}

