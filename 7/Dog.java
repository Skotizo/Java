package p7;

public class Dog implements Pet 
{

	int happy = 0;
	public void reward(int numTimesIN)
	{
		happy = numTimesIN * 3;
	}
	public void beat(int NumTimesIN)
	{
		happy = NumTimesIN *2;
	}
	public void act()
	{
		System.out.println("The Current happyness is... " + happy);
		if(happy <= 0)
		{
			System.out.println("Your dog is basically dead inside");
		}
		if(happy >= 5)
		{
			System.out.println("Your relationship is a testomony of the phrase Man's best friend");
		}
	}

}
