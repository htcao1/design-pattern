package pattern.create.abstractfactory.example2.monster;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 水系怪物2
 */
public class WaterMonster2 extends AbstractWaterMonster {

    private static AtomicInteger monsterID = new AtomicInteger(0);

    public WaterMonster2() {

        super(monsterID.addAndGet(1));
    }

    @Override
    public String getType() {

        return EWaterMonsterType.TYPEB.getType();
    }
}
