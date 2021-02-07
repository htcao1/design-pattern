package pattern.create.abstractfactory.example2.boss;

import java.util.concurrent.atomic.AtomicInteger;

public class FireBoss2 extends AbstractFireBoss {

	private static AtomicInteger bossID = new AtomicInteger(0);
	
	public FireBoss2() {
		super(bossID.addAndGet(1));
	}

	@Override
	public String getType() {
		return EFireBossType.TYPEB.getType();
	}

}
