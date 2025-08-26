package oops_practice;

public class BankAccount {
	private double balance=0;
	public void deposit(double amt)
	{
		if(amt>0)
		{
			balance+=amt;
			System.out.println("Deposited="+amt);
		}
	}
	private void withdraw(double amt)
	{
		if(amt>0 && amt<=balance)
		{
			balance=-amt;
			System.out.println("withdraw amount="+"****.*");	
		}
		else
		{
			System.out.println("invalid amount");
		}
	}
	private double getbalance()
	{
		return balance;
	}

	public static void main(String[] args) {
		BankAccount ba=new BankAccount();
		ba.deposit(5000.0);
		ba.withdraw(2000);
		
		

	}

}
