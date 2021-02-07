package pattern.create.factory.example2;

import pattern.create.factory.example2.exception.MonsterTypeNotExistException;
import pattern.create.factory.example2.factory.MonsterFactory;
import pattern.create.factory.example2.monster.AbstractMonster;
import pattern.create.factory.example2.monster.EMonsterType;


/**
 * 例2.工厂模式 - 实际案例
 * <p>
 * 增加部分：
 * 1.采用抽象类代替接口；（抽象类可以更好的实现模板功能）
 * 2.增加怪物类型枚举；（约束怪物种类，传参可视化）
 * 3.增加怪物自增编号；（利用唯一编号动态管理同类对象）
 * 4.增加自定义异常-怪物不存在；（增加扩展安全性）
 */
public class FactoryExample2 {

    public static void main(String[] args) throws MonsterTypeNotExistException {
        // 创建工厂
        MonsterFactory factory = new MonsterFactory();

        // 生成怪物
        AbstractMonster monsterA1 = factory.createMonster(EMonsterType.A);
        monsterA1.say();
        AbstractMonster monsterA2 = factory.createMonster(EMonsterType.A);
        monsterA2.say();
        AbstractMonster monsterA3 = factory.createMonster(EMonsterType.A);
        monsterA3.say();
        AbstractMonster monsterB1 = factory.createMonster(EMonsterType.B);
        monsterB1.say();

        // 添加新怪物不完整时，抛出异常演示
        AbstractMonster monsterC1 = factory.createMonster(EMonsterType.C);
        monsterC1.say();
    }
}


