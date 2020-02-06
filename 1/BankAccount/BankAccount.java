package BankAccount;

public class BankAccount 
{
	private String accountName;
	private double amount;

	//Constructs a new bank account with the name 'nameIn'
	public BankAccount(String nameIn)
	{
		accountName = nameIn;
		amount = 0;
	}
	
	//Adds the depositAmount to the total in the account
	public void deposit(double depositAmount)
	{
		amount += depositAmount;
	}
	
	//Removes the withDrawAmount from the total in the account
	public void withDraw(double withDrawAmount)
	{
		amount -= withDrawAmount;
	}
	
	//Returns the amount of money in the account
	public double getBalance()
	{
		return amount;
	}
	
	//Sets the balance to a different amount
	public void setBalance(double amountIn)
	{
		amount = amountIn;
	}
	
	//Returns the name of the account
	public String getAccountName()
	{
		return accountName;
	}
	
/*	Only need this for Lesson #4:  Recode with them in class.
 * 	public String toString()
	{
		return accountName;
	}
	
	public boolean isEqual(BankAccount anotherAccount)
	{
		if(anotherAccount.getAccountName().equalsIgnoreCase(accountName))
			return true;
		else
			return false;
	}*/
}
