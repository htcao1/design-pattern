package pattern.create.abstractfactory.example2.monster;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 火系怪物1
 */
public class FireMonster1 extends AbstractFireMonster {

    private static AtomicInteger monsterID = new AtomicInteger(0);

    public FireMonster1() {

        super(monsterID.addAndGet(1));
    }

    @Override
    public String getType() {

        return EFireMonsterType.TYPEA.getType();
    }
}
