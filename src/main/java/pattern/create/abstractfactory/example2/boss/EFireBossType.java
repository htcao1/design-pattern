package pattern.create.abstractfactory.example2.boss;

/** 枚举类-火系BOSS类型 */
public enum EFireBossType {
	TYPEA("火系BOSSA"), TYPEB("火系BOSSB");

	private String type;

	private EFireBossType(String t) {
		this.type = t;
	}

	public static EFireBossType getType(String t) {
		for (EFireBossType eType : EFireBossType.values()) {
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
