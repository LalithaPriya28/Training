package assignment1;

import java.util.Scanner;

public class Primes {


	public static void main(String[] args) {
		int temp=0;
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=2;j<=i-1;j++) {
				if(i%j==0)
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println(i);
			}
			else {
				temp=0;
			}
		}
	}

}
