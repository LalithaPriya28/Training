package day2;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Press \n 1.Deposit \n 2.Withdrawl\n 3.Balance check");
		Scanner scan =new Scanner(System.in);
		int check=scan.nextInt();
		if(check==1)
		{
			System.out.println("You are here for the deposit");
		}
		else if(check==2)
		{
			System.out.println("You are here for the withdrawl");
		}
		else if(check==3)
		{
			System.out.println("You are here for the balance check");
		}
		else
		{
			System.out.println("invalid option");
		}
	}

}
