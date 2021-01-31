package assignment1;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		 int r,sum=0,temp;    
			System.out.println("Enter a Number:");
			Scanner scanner =new Scanner(System.in);
			int n=scanner.nextInt();
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		

	}

