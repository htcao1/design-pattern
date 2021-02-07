package pattern.create.abstractfactory.example2.factory;

import pattern.create.abstractfactory.example2.boss.IBoss;
import pattern.create.abstractfactory.example2.exception.BossTypeNotExistException;
import pattern.create.abstractfactory.example2.exception.MonsterTypeNotExistException;
import pattern.create.abstractfactory.example2.monster.IMonster;

/**
 * 超级抽象怪物工厂
 */
public abstract class AbstractMonsterFactory {
    /**
     * 生成BOSS
     */
    abstract IBoss createBoss(String type) throws BossTypeNotExistException;

    /**
     * 生成怪物
     */
    abstract IMonster createMonster(String type) throws MonsterTypeNotExistException;
}
