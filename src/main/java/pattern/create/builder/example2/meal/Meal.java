package pattern.create.builder.example2.meal;

import pattern.create.builder.example2.item.base.IItem;

import java.util.ArrayList;
import java.util.List;

/**
 * 一餐
 */
public class Meal {
    private List<IItem> items = new ArrayList<IItem>();

    public void addItem(IItem item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (IItem item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (int i = 0; i < items.size(); i++) {
            IItem item = items.get(i);
            System.out.println((i + 1) + ". 商品: " + item.name() + ", 包装: " + item.packing().pack() + ", 价格: " + item.price());
        }
    }
}
