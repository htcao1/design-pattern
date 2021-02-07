package pattern.create.factory.example2.monster;

/**
 * 怪物抽象类
 * 采用抽象类代替接口，抽象类可以更好地实现模板功能
 */
public abstract class AbstractMonster {
    private int id;

    public AbstractMonster(int id) {

        this.id = id;
    }

    public void say() {

        System.out.println("我是" + this.getMonsterType().getTypeName() + ", 编号:" + this.id);
    }

    abstract EMonsterType getMonsterType();
}
