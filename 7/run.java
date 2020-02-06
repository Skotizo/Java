package p7;

public class run 
{
	public static void main(String[] args)
	{
	Pet fido = new Dog();
	Pet socks = new Cat();
	
	fido.reward(5);
	socks.beat(3);
	
	fido.act();
	socks.act();
	
	}
}
