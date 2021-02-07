package pattern.create.abstractfactory.example2.monster;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 火系怪物2
 */
public class FireMonster2 extends AbstractFireMonster {

    private static AtomicInteger monsterID = new AtomicInteger(0);

    public FireMonster2() {

        super(monsterID.addAndGet(1));
    }

    @Override
    public String getType() {

        return EFireMonsterType.TYPEB.getType();
    }
}
