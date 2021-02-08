package InterfaceDemos;

public class SalaryAccount implements Accounts {

	@Override
	public void minimumBalance(int amount) {
		// TODO Auto-generated method stub
		System.out.println("The min balance for Salary account is" +amount);
	}

}
