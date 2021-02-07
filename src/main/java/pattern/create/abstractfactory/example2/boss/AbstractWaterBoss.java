package pattern.create.abstractfactory.example2.boss;

public abstract class AbstractWaterBoss implements IBoss {
	private int id;

	public AbstractWaterBoss(int id) {
		this.id = id;
	}

	@Override
	public void roar() {
		System.out.println("我是" + this.getType() + ", 编号:" + this.id);
	}
}
