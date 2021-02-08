package Assignment;

import java.util.Scanner;


public class Account extends AccountDetails {
	Scanner s=new Scanner(System.in);
	int amount=s.nextInt();
	
	
	int balance=0;
	void withdraw(int amount) {
		balance=balance-amount;
		System.out.println("The Current balance after withdraw is:" +balance);
	}
	
	void deposit(int amount) {
		balance=balance+amount;
		
		System.out.println("The Current balance after Deposit is:" +balance);
	}


}
