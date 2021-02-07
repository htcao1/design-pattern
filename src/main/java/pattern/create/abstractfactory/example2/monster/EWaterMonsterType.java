package pattern.create.abstractfactory.example2.monster;

/**
 * 枚举类-水系怪物类型
 */
public enum EWaterMonsterType {
    TYPEA("水系怪物A"), TYPEB("水系怪物B");

    private String type;

    private EWaterMonsterType(String t) {
        this.type = t;
    }

    public static EWaterMonsterType getType(String t) {
        for (EWaterMonsterType eType : EWaterMonsterType.values()) {
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
