package pattern.create.abstractfactory.example1;

/**
 * 例1.抽象工厂模式 - 简单（教学演示）
 */
public class AbstractFactoryExample1 {

	public static void main(String[] args) {
		// 创建-水系怪物工厂
		WaterMonsterFactory waterMonsterFactory = new WaterMonsterFactory();
		// 创建-火系怪物工厂
		FireMonsterFactory fireMonsterFactory = new FireMonsterFactory();

		System.out.println("-------- 创建水系怪物群 --------");
		
		// 生成水系BOSS+怪物
		IBoss waterBoss1 = waterMonsterFactory.createBoss(1);
		IBoss waterBoss2 = waterMonsterFactory.createBoss(2);
		waterBoss1.roar();
		waterBoss2.roar();
		IMonster waterMonster1 = waterMonsterFactory.createMonster(1);
		IMonster waterMonster2 = waterMonsterFactory.createMonster(2);
		waterMonster1.say();
		waterMonster2.say();
		
		System.out.println();
		System.out.println("-------- 创建火系怪物群 --------");

		// 生成火系BOSS+怪物
		IBoss fireBoss1 = fireMonsterFactory.createBoss(1);
		IBoss fireBoss2 = fireMonsterFactory.createBoss(2);
		fireBoss1.roar();
		fireBoss2.roar();
		IMonster fireMonster1 = fireMonsterFactory.createMonster(1);
		IMonster fireMonster2 = fireMonsterFactory.createMonster(2);
		fireMonster1.say();
		fireMonster2.say();
	}
}

/** BOSS接口 */
interface IBoss {
	void roar(); // 咆哮
}

interface IWaterBoss extends IBoss {

}

interface IFireBoss extends IBoss {

}

class WaterBoss1 implements IWaterBoss {
	@Override
	public void roar() {
		System.out.println("我是水系BOSS1");
	}
}

class WaterBoss2 implements IWaterBoss {
	@Override
	public void roar() {
		System.out.println("我是水系BOSS2");
	}
}

class FireBoss1 implements IFireBoss {
	@Override
	public void roar() {
		System.out.println("我是火系BOSS1");
	}
}

class FireBoss2 implements IFireBoss {
	@Override
	public void roar() {
		System.out.println("我是火系BOSS2");
	}
}

/** 怪物接口 */
interface IMonster {
	void say(); // 说
}

interface IWaterMonster extends IMonster {

}

interface IFireMonster extends IMonster {

}

/** 水系怪物1 */
class WaterMonster1 implements IWaterMonster {
	@Override
	public void say() {
		System.out.println("我是水系怪物1");
	}
}

/** 水系怪物2 */
class WaterMonster2 implements IWaterMonster {
	@Override
	public void say() {
		System.out.println("我是水系怪物2");
	}
}

/** 火系怪物1 */
class FireMonster1 implements IFireMonster {
	@Override
	public void say() {
		System.out.println("我是火系怪物1");
	}
}

/** 火系怪物2 */
class FireMonster2 implements IFireMonster {
	@Override
	public void say() {
		System.out.println("我是火系怪物2");
	}
}

/** 超级抽象怪物工厂 */
abstract class AbstractMonsterFactory {
	/** 生成BOSS */
	abstract IBoss createBoss(int type);

	/** 生成怪物 */
	abstract IMonster createMonster(int type);
}

/** 怪物工厂-水系 */
class WaterMonsterFactory extends AbstractMonsterFactory {
	/** 创建Boss */
	public IWaterBoss createBoss(int type) {
		switch (type) {
		case 1:
			return new WaterBoss1();
		case 2:
			return new WaterBoss2();
		}
		return null;
	}

	/** 创建怪物 */
	public IWaterMonster createMonster(int type) {
		switch (type) {
		case 1:
			return new WaterMonster1();
		case 2:
			return new WaterMonster2();
		}
		return null;
	}
}

/** 怪物工厂-火系 */
class FireMonsterFactory extends AbstractMonsterFactory {
	/** 创建Boss */
	public IFireBoss createBoss(int type) {
		switch (type) {
		case 1:
			return new FireBoss1();
		case 2:
			return new FireBoss2();
		}
		return null;
	}

	/** 创建怪物 */
	public IFireMonster createMonster(int type) {
		switch (type) {
		case 1:
			return new FireMonster1();
		case 2:
			return new FireMonster2();
		}
		return null;
	}
}
