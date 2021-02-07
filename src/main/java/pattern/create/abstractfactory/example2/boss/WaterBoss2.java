package pattern.create.abstractfactory.example2.boss;

import java.util.concurrent.atomic.AtomicInteger;

public class WaterBoss2 extends AbstractWaterBoss {

	private static AtomicInteger bossID = new AtomicInteger(0);
	
	public WaterBoss2() {
		super(bossID.addAndGet(1));
	}

	@Override
	public String getType() {
		return EWaterBossType.TYPEB.getType();
	}
}
