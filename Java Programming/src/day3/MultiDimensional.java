package day3;


import java.util.Scanner;

public class MultiDimensional {
	
	public static void main(String[] args) {
	 
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the row size:");
		int row=scan.nextInt();
		System.out.println("Enter the column size:");
		int c=scan.nextInt();
		
		int m[][]=new int[row][c];
		System.out.println("row length" + " " + m.length);
		System.out.println("column length" + " " + m[1].length);
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[1].length;j++) {
				System.out.println("values at marks["+ i +"]["+j+"]=");
				m[i][j]=scan.nextInt();
			}
		}
	}
}

		

		
				
	


