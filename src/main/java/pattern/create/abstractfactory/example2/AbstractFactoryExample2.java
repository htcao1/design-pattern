package pattern.create.abstractfactory.example2;

import pattern.create.abstractfactory.example2.boss.EFireBossType;
import pattern.create.abstractfactory.example2.boss.EWaterBossType;
import pattern.create.abstractfactory.example2.boss.IBoss;
import pattern.create.abstractfactory.example2.exception.BossTypeNotExistException;
import pattern.create.abstractfactory.example2.exception.MonsterTypeNotExistException;
import pattern.create.abstractfactory.example2.factory.FireMonsterFactory;
import pattern.create.abstractfactory.example2.factory.WaterMonsterFactory;
import pattern.create.abstractfactory.example2.monster.EFireMonsterType;
import pattern.create.abstractfactory.example2.monster.EWaterMonsterType;
import pattern.create.abstractfactory.example2.monster.IMonster;

/**
 * 例2.抽象工厂模式 - 实际案例
 * <p>
 * 增加部分：
 * 1.采用抽象类代替接口；（抽象类可以更好的实现模板功能）
 * 2.增加BOSS、怪物类型枚举；（约束怪物种类，传参可视化）
 * 3.增加BOSS、怪物自增编号；（利用唯一编号动态管理同类对象）
 * 4.增加自定义异常-BOSS、怪物不存在；（增加扩展安全性）
 */
public class AbstractFactoryExample2 {

    public static void main(String[] args) throws BossTypeNotExistException, MonsterTypeNotExistException {
        // 创建-水系怪物工厂
        WaterMonsterFactory waterMonsterFactory = new WaterMonsterFactory();
        // 创建-水系怪物工厂
        FireMonsterFactory fireMonsterFactory = new FireMonsterFactory();

        System.out.println("-------- 创建水系怪物群 --------");

        // 生成水系BOSS+怪物
        IBoss waterBoss1_1 = waterMonsterFactory.createBoss(EWaterBossType.TYPEA.getType());
        IBoss waterBoss1_2 = waterMonsterFactory.createBoss(EWaterBossType.TYPEA.getType());
        waterBoss1_1.roar();
        waterBoss1_2.roar();
        IMonster waterMonster1_1 = waterMonsterFactory.createMonster(EWaterMonsterType.TYPEA.getType());
        IMonster waterMonster1_2 = waterMonsterFactory.createMonster(EWaterMonsterType.TYPEA.getType());
        IMonster waterMonster1_3 = waterMonsterFactory.createMonster(EWaterMonsterType.TYPEA.getType());
        IMonster waterMonster2_1 = waterMonsterFactory.createMonster(EWaterMonsterType.TYPEB.getType());
        waterMonster1_1.say();
        waterMonster1_2.say();
        waterMonster1_3.say();
        waterMonster2_1.say();

        System.out.println();
        System.out.println("-------- 创建火系怪物群 --------");

        // 生成火系BOSS+怪物
        IBoss fireBoss1 = fireMonsterFactory.createBoss(EFireBossType.TYPEA.getType());
        IBoss fireBoss2 = fireMonsterFactory.createBoss(EFireBossType.TYPEB.getType());
        fireBoss1.roar();
        fireBoss2.roar();
        IMonster fireMonster1 = fireMonsterFactory.createMonster(EFireMonsterType.TYPEA.getType());
        IMonster fireMonster2_1 = fireMonsterFactory.createMonster(EFireMonsterType.TYPEB.getType());
        IMonster fireMonster2_2 = fireMonsterFactory.createMonster(EFireMonsterType.TYPEB.getType());
        IMonster fireMonster2_3 = fireMonsterFactory.createMonster(EFireMonsterType.TYPEB.getType());
        fireMonster1.say();
        fireMonster2_1.say();
        fireMonster2_2.say();
        fireMonster2_3.say();
    }
}
