package assignment1;

import java.util.Scanner;

public class CubeSeries {
	static int cube=0;
	static String temp= " ";
	public static void CubePrint(int n) {
		for(int i=1;i<=n;i++) {
			cube=i*i*i;
			
			temp= temp + " " +cube;
			
		}
		return;
	
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = s.nextInt(); 
        CubePrint(n);
		System.out.print( "The first"+ " " + n + " " +"cubes are :" +temp);
	 
	}

}

