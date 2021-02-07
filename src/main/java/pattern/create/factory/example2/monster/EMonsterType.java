package pattern.create.factory.example2.monster;

/**
 * 枚举类-怪物类型
 */
public enum EMonsterType {
    A("怪物A"), B("怪物B"), C("怪物C");

    private String typeName;

    private EMonsterType(String n) {

        this.typeName = n;
    }

    public String getTypeName() {

        return this.typeName;
    }
}
