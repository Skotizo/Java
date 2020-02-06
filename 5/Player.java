package chp9;

public abstract class Player {
	int baseDamage;
	String Name;
	public int attack()
	{
		return baseDamage;
	}

	
	
	public int getBaseDamage() {
		return baseDamage;
	}
	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
}
