package pattern.create.factory.example2.monster;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 怪物B
 */
public class MonsterB extends AbstractMonster {

    private static AtomicInteger monsterID = new AtomicInteger(0);

    public MonsterB() {

        super(monsterID.addAndGet(1));
    }

    @Override
    public EMonsterType getMonsterType() {
        return EMonsterType.B;
    }

}
