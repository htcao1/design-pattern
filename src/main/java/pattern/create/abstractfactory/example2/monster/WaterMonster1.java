package pattern.create.abstractfactory.example2.monster;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 水系怪物1
 */
public class WaterMonster1 extends AbstractWaterMonster {

    private static AtomicInteger monsterID = new AtomicInteger(0);

    public WaterMonster1() {

        super(monsterID.addAndGet(1));
    }

    @Override
    public String getType() {

        return EWaterMonsterType.TYPEA.getType();
    }
}
