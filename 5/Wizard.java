package chp9;

public class Wizard extends Player {
	private int spellDamage;
	private int manaCount;
	
	public Wizard(int spell, int mana)
	{
		spellDamage = spell;
		manaCount= mana;
		
		
	}
	public String castSpell()
	{
		manaCount--;
		return "Remaining mana: " + manaCount;
	}
	public int getSpellDamage() {
		return spellDamage;
	}
	public void setSpellDamage(int spellDamage) {
		this.spellDamage = spellDamage;
	}
	public int getManaCount() {
		return manaCount;
	}
	public void setManaCount(int manaCount) {
		this.manaCount = manaCount;
	}
	

}
