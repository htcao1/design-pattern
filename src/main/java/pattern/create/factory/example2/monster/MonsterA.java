package pattern.create.factory.example2.monster;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 怪物A
 */
public class MonsterA extends AbstractMonster {

    private static AtomicInteger monsterID = new AtomicInteger(0);

    public MonsterA() {

        super(monsterID.addAndGet(1));
    }

    @Override
    public EMonsterType getMonsterType() {

        return EMonsterType.A;
    }

}
