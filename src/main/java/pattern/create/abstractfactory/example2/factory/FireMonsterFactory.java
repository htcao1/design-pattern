package pattern.create.abstractfactory.example2.factory;

import pattern.create.abstractfactory.example2.boss.*;
import pattern.create.abstractfactory.example2.exception.BossTypeNotExistException;
import pattern.create.abstractfactory.example2.exception.MonsterTypeNotExistException;
import pattern.create.abstractfactory.example2.monster.*;

/**
 * 怪物工厂-火系
 */
public class FireMonsterFactory extends AbstractMonsterFactory {
    /**
     * 创建Boss
     *
     * @param type 请从{@link pattern.create.abstractfactory.example2.boss.EFireBossType}取值
     * @throws BossTypeNotExistException
     */
    public AbstractFireBoss createBoss(String type) throws BossTypeNotExistException {
        EFireBossType eType = EFireBossType.getType(type);
        if (eType == null) {
            throw new BossTypeNotExistException(String.valueOf(type));
        }
        switch (eType) {
            case TYPEA:
                return new FireBoss1();
            case TYPEB:
                return new FireBoss2();
        }
        return null;
    }

    /**
     * 创建怪物
     *
     * @param type 请从{@link pattern.create.abstractfactory.example2.monster.EFireMonsterType}取值
     * @throws MonsterTypeNotExistException
     */
    public AbstractFireMonster createMonster(String type) throws MonsterTypeNotExistException {
        EFireMonsterType eType = EFireMonsterType.getType(type);
        if (eType == null) {
            throw new MonsterTypeNotExistException(String.valueOf(type));
        }
        switch (eType) {
            case TYPEA:
                return new FireMonster1();
            case TYPEB:
                return new FireMonster2();
        }
        return null;
    }
}
