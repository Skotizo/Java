//Created by Brevan & Michael
public class Chapter6Program5 
{
	public static void main(String[] args)
	{
		String[] names = {"Brevan", "Michael", "Nathan", "Nick", "Tyler", "Ethan", "David"};
		double randoNumber= Math.random() * names.length -1;
		int arrayNumber = (int) randoNumber;
		System.out.println(names[arrayNumber]);
	}

}
