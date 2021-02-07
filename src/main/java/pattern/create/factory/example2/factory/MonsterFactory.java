package pattern.create.factory.example2.factory;

import pattern.create.factory.example2.exception.MonsterTypeNotExistException;
import pattern.create.factory.example2.monster.AbstractMonster;
import pattern.create.factory.example2.monster.MonsterA;
import pattern.create.factory.example2.monster.MonsterB;
import pattern.create.factory.example2.monster.EMonsterType;

/**
 * 怪物工厂
 */
public class MonsterFactory {
    /**
     * 创建怪物
     * 使用枚举，限制类型，传参可视化
     *
     * @param mType 怪物类型，{@link EMonsterType}类型
     * @return {@link AbstractMonster} 抽象怪物类
     * @throws MonsterTypeNotExistException 怪物类型不存在
     */
    public AbstractMonster createMonster(EMonsterType mType) throws MonsterTypeNotExistException {
        switch (mType) {
            case A:
                return new MonsterA();
            case B:
                return new MonsterB();
            default:
                throw new MonsterTypeNotExistException(mType.getTypeName());
        }
    }
}
