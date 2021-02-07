package pattern.create.abstractfactory.example2.monster;

public abstract class AbstractFireMonster implements IMonster {
    private int id;

    public AbstractFireMonster(int id) {
        this.id = id;
    }

    @Override
    public void say() {

        System.out.println("我是" + this.getType() + ", 编号:" + this.id);
    }
}
