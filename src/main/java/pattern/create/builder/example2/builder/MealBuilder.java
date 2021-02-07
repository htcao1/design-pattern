package pattern.create.builder.example2.builder;

import pattern.create.builder.example2.item.base.IItem;
import pattern.create.builder.example2.meal.Meal;

/**
 * 建造类 - 生成用餐
 */
public class MealBuilder {

    private Meal meal;

    public MealBuilder() {
        this.meal = new Meal();
    }

    /**
     * 点餐
     */
    public MealBuilder add(IItem item) {
        this.meal.addItem(item);
        return this;
    }

    /**
     * 生产订单
     */
    public Meal build() {
        return this.meal;
    }
}
