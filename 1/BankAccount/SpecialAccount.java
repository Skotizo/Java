package BankAccount;

public class SpecialAccount extends BankAccount
{
	private String owner;
	
	public SpecialAccount(String nameIn)
	{
		
		super(nameIn);
		owner = "John Doe";
	}
	
	public String getOwner()
	{
		return owner;
	}
	
	public void setOwner(String nameIn)
	{
		owner = nameIn;
	}
	
	public void payInterest()
	{
		double interest;
		double amount = getBalance();
		if(amount <= 20000.0)
		{
			interest = amount * 0.02;
		}
		else
		{
			interest = (20000.0 * 0.02) + ((amount - 20000.0) * 0.001);
			
		}
		
		deposit(interest);
	}
	
	
}
