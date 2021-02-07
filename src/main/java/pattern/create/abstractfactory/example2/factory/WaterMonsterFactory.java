package pattern.create.abstractfactory.example2.factory;

import pattern.create.abstractfactory.example2.boss.*;
import pattern.create.abstractfactory.example2.exception.BossTypeNotExistException;
import pattern.create.abstractfactory.example2.exception.MonsterTypeNotExistException;
import pattern.create.abstractfactory.example2.monster.*;

/**
 * 怪物工厂-水系
 */
public class WaterMonsterFactory extends AbstractMonsterFactory {
    /**
     * 创建Boss
     */
    public AbstractWaterBoss createBoss(String type) throws BossTypeNotExistException {
        EWaterBossType eType = EWaterBossType.getType(type);
        if (eType == null) {
            throw new BossTypeNotExistException(String.valueOf(type));
        }
        switch (eType) {
            case TYPEA:
                return new WaterBoss1();
            case TYPEB:
                return new WaterBoss2();
        }
        return null;
    }

    /**
     * 创建怪物
     */
    public AbstractWaterMonster createMonster(String type) throws MonsterTypeNotExistException {
        EWaterMonsterType eType = EWaterMonsterType.getType(type);
        if (eType == null) {
            throw new MonsterTypeNotExistException(String.valueOf(type));
        }
        switch (eType) {
            case TYPEA:
                return new WaterMonster1();
            case TYPEB:
                return new WaterMonster2();
        }
        return null;
    }
}
