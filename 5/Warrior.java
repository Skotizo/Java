package chp9;

public class Warrior extends Player {
	private int meleeDamage;
	
	public Warrior(int baseDamageIN, String NameIN)
	{
		baseDamage = baseDamageIN;
		NameIN = Name;
	}
	public int attack()
	{
		return baseDamage + meleeDamage;
	}
	public int getMeleeDamage() {
		return meleeDamage;
	}
	public void setMeleeDamage(int meleeDamage) {
		this.meleeDamage = meleeDamage;
	}
	
	

	

	

}
