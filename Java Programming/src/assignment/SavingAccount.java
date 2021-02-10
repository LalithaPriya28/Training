package assignment;


abstract class AccountDetails{
	abstract void withdraw(int amount);
	abstract void deposit(int amount);
	
}

public class SavingAccount {
	
	 
	public static void main(String args[]) {
		
		AccountDetails ad=new Account();
		ad.deposit(2000);
	}
}
