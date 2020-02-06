package BankAccount;

public class SpecialAccountRunner 
{
	public static void main(String[] args)
	{
		//Create a new SpecialAccount Object using
		//its constructor.
		SpecialAccount Savings = new SpecialAccount("Savings");
		
		

		//Set the owner of the account to 'Bruce Wayne'
		Savings.setOwner("Bruce Wayne");

		//Deposit (add) $25,000 to the new account.
		Savings.deposit(25000);
		
		//Call the 'payInterest' method
		Savings.payInterest();
		//Display the balance.  If the coded correctly
		//the balance should be $25,405.
		System.out.println(Savings.getBalance());
		//Display the owners name using getOwner() method.
		System.out.println(Savings.getOwner());
	}
}
