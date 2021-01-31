package assignment1;

import java.util.*; 
import java.lang.*; 

public class CubeSum {
		public static int SumOfSeries(int m) 
		{ 
			int sum = 0; 
			for(int i=1; i<=m; i++) 
				sum += i*i*i; 
			return sum; 
		} 
 
		public static void main(String[] args) 
		{ 
			Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number:");
	        int m = s.nextInt(); 
			System.out.println(SumOfSeries(m)); 

		} 
	} 





