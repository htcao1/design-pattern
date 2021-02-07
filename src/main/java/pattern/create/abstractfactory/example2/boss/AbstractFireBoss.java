package pattern.create.abstractfactory.example2.boss;

public abstract class AbstractFireBoss implements IBoss {
	private int id;

	public AbstractFireBoss(int id) {
		this.id = id;
	}

	@Override
	public void roar() {
		System.out.println("我是" + this.getType() + ", 编号:" + this.id);
	}
}
