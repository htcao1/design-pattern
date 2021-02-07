package pattern.create.factory.example1;

/**
 * 例1.工厂模式 - 简单（教学演示）
 */
public class FactoryExample1 {

    public static void main(String[] args) {
        // 创建工厂
        MonsterFactory factory = new MonsterFactory();

        // 生成怪物
        IMonster monsterA1 = factory.createMonster("A");
        monsterA1.say();
        IMonster monsterA2 = factory.createMonster("A");
        monsterA2.say();
        IMonster monsterA3 = factory.createMonster("A");
        monsterA3.say();
        IMonster monsterB1 = factory.createMonster("B");
        monsterB1.say();

        // 添加新怪物不完整时，怪物为null，会抛出空指针异常
        IMonster monsterC1 = factory.createMonster("C");
        monsterC1.say();
    }
}

/**
 * 怪物接口
 */
interface IMonster {
    void say();
}

/**
 * 怪物A
 */
class MonsterA implements IMonster {
    @Override
    public void say() {
        System.out.println("我是怪物A");
    }
}

/**
 * 怪物B
 */
class MonsterB implements IMonster {
    @Override
    public void say() {
        System.out.println("我是怪物B");
    }

}

/**
 * 怪物B
 */
class MonsterC implements IMonster {
    @Override
    public void say() {
        System.out.println("我是怪物C");
    }

}

/**
 * 怪物工厂
 */
class MonsterFactory {

    /**
     * 创建怪物
     *
     * @param type 怪物类型
     * @return {@link IMonster}
     */
    public IMonster createMonster(String type) {
        switch (type) {
            case "A":
                return new MonsterA();
            case "B":
                return new MonsterB();
            case "C":
                return new MonsterC();
        }
        return null;
    }
}
