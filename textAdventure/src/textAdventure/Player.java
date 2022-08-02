package textAdventure;

public class Player {
	private int hp;
	private int maxHp;
	private int xp;
	private int maxXp;
	
	private int armorClass;
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
	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}
	public int getMaxXp() {
		return maxXp;
	}
	public void setMaxXp(int maxXp) {
		this.maxXp = maxXp;
	}
	public int getArmorClass() {
		return armorClass;
	}
	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
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
