package p7;

public class Cat implements Pet 
{
	int happy = 0;
	public void reward(int numTimesIN)
	{
		happy =+ numTimesIN * 1;
	}
	public void beat(int NumTimesIN)
	{
		happy =- NumTimesIN *3;
	}
	public void act()
	{
		System.out.println("The Current happyness is... " + happy);
		if(happy <= 0)
		{
			System.out.println("Your cat is basically dead inside");
		}
		if(happy >= 5)
		{
			System.out.println("Your cat brushes your leg and puurssssssssssss");
		}
	}
}
