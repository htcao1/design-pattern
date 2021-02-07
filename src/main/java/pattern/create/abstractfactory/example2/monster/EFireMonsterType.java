package pattern.create.abstractfactory.example2.monster;

/**
 * 枚举类-火系怪物类型
 */
public enum EFireMonsterType {
    TYPEA("火系怪物A"), TYPEB("火系怪物B");

    private String type;

    private EFireMonsterType(String t) {
        this.type = t;
    }

    public static EFireMonsterType getType(String t) {
        for (EFireMonsterType eType : EFireMonsterType.values()) {
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
