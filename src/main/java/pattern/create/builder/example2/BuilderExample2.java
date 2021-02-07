package pattern.create.builder.example2;

import pattern.create.builder.example2.builder.MealBuilder;
import pattern.create.builder.example2.item.ChickenBurger;
import pattern.create.builder.example2.item.Coffee;
import pattern.create.builder.example2.item.Coke;
import pattern.create.builder.example2.item.VegBurger;
import pattern.create.builder.example2.meal.Meal;

/**
 * 例2.建造者模式 - 实际案例：肯德基点餐
 */
public class BuilderExample2 {
    public static void main(String[] args) {
        // 全给他点了
        Meal meal = new MealBuilder()
                .add(new VegBurger())
                .add(new ChickenBurger())
                .add(new Coke())
                .add(new Coffee())
                .build();

        System.out.println("订单内容：");
        meal.showItems();
        System.out.println("总价: " + meal.getCost());
    }
}
