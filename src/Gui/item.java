package Gui;

public class item extends gear{
	int stabBonus;
	int slashBonus;
	int CrushBonus;
	int magicBonus;
	int rangeBonus;
	
	int meleeStrength;
	int rangedStrength;
	int magicDamage;
	
	
	
	public item(int stabBonus, int slashBonus, int crushBonus, int magicBonus, int rangeBonus, int meleeStrength,
			int rangedStrength, int magicDamage) {
		super();
		this.stabBonus = stabBonus;
		this.slashBonus = slashBonus;
		CrushBonus = crushBonus;
		this.magicBonus = magicBonus;
		this.rangeBonus = rangeBonus;
		this.meleeStrength = meleeStrength;
		this.rangedStrength = rangedStrength;
		this.magicDamage = magicDamage;
	}
	
	public int getStabBonus() {
		return stabBonus;
	}
	public void setStabBonus(int stabBonus) {
		this.stabBonus = stabBonus;
	}
	public int getSlashBonus() {
		return slashBonus;
	}
	public void setSlashBonus(int slashBonus) {
		this.slashBonus = slashBonus;
	}
	public int getCrushBonus() {
		return CrushBonus;
	}
	public void setCrushBonus(int crushBonus) {
		CrushBonus = crushBonus;
	}
	public int getMagicBonus() {
		return magicBonus;
	}
	public void setMagicBonus(int magicBonus) {
		this.magicBonus = magicBonus;
	}
	public int getRangeBonus() {
		return rangeBonus;
	}
	public void setRangeBonus(int rangeBonus) {
		this.rangeBonus = rangeBonus;
	}
	public int getMeleeStrength() {
		return meleeStrength;
	}
	public void setMeleeStrength(int meleeStrength) {
		this.meleeStrength = meleeStrength;
	}
	public int getRangedStrength() {
		return rangedStrength;
	}
	public void setRangedStrength(int rangedStrength) {
		this.rangedStrength = rangedStrength;
	}
	public int getMagicDamage() {
		return magicDamage;
	}
	public void setMagicDamage(int magicDamage) {
		this.magicDamage = magicDamage;
	}

	@Override
	public String toString() {
		return "item [stabBonus=" + stabBonus + ", slashBonus=" + slashBonus + ", CrushBonus=" + CrushBonus
				+ ", magicBonus=" + magicBonus + ", rangeBonus=" + rangeBonus + ", meleeStrength=" + meleeStrength
				+ ", rangedStrength=" + rangedStrength + ", magicDamage=" + magicDamage + "]";
	}	
	
	
	
	
}
