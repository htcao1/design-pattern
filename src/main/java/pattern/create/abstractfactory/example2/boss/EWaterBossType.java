package pattern.create.abstractfactory.example2.boss;

/**
 * 枚举类-水系BOSS类型
 */
public enum EWaterBossType {
    TYPEA("水系BOSSA"), TYPEB("水系BOSSB");

    private String type;

    private EWaterBossType(String t) {
        this.type = t;
    }

    public static EWaterBossType getType(String t) {
        for (EWaterBossType eType : EWaterBossType.values()) {
            if (eType.type.equals(t)) {
                return eType;
            }
        }
        return null;
    }

    public String getType() {
        return this.type;
    }
}
