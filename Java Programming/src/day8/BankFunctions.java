package day8;

interface BankFunctions {
	void CreateAccount();
	void MaintainTransactions();

}
 class Icici implements BankFunctions
 {

	@Override
	public void CreateAccount() {
		int accountNumber=26253726;
		System.out.println("Your account number is: "+ " "+accountNumber);
		
		
	}

	@Override
	public void MaintainTransactions() {
		int accountBalance=12000;
		System.out.println("Your Account Balance is"+" "+accountBalance);
		
	}


		
	}
 public class InterfaceDemo {

		public static void main(String[] args) {
			InterfaceDemo I= new InterfaceDemo();
			
		}
		
		}