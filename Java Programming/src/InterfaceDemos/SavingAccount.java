package InterfaceDemos;



public class SavingAccount  implements Accounts {

	@Override
	public void minimumBalance(int amount) {
		// TODO Auto-generated method stub
		System.out.println("The min balance for savings account is" +amount);

	}

}
