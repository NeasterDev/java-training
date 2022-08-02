package textAdventure;

public class Monster {
	private int hp;
	private int maxHp;
	
	private int armorClass;
	private int unarmedDamage;
	private int weaponBonus;
	
	private boolean isAlive;
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	public int getArmorClass() {
		return armorClass;
	}
	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}
	public int getUnarmedDamage() {
		return unarmedDamage;
	}
	public void setUnarmedDamage(int unarmedDamage) {
		this.unarmedDamage = unarmedDamage;
	}
	public int getWeaponBonus() {
		return weaponBonus;
	}
	public void setWeaponBonus(int weaponBonus) {
		this.weaponBonus = weaponBonus;
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	
}
