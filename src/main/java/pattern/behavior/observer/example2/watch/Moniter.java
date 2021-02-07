package pattern.behavior.observer.example2.watch;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;
import java.util.Observer;

/**
 * 显示器（观察者，并完成了功能显示）
 */
public class Moniter implements PropertyChangeListener {
    // 显示器编号
    private int id;

    public Moniter(int id, Player player) {
        this.id = id;
        // 添加到玩家的观察者列表中
        player.addPropertyChangeListener(this);
    }

    /**
     * 属性发生变化
     */
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("[显示器" + id + "] 玩家生命值：" + evt.getOldValue() + " --> " + evt.getNewValue());
    }
}

