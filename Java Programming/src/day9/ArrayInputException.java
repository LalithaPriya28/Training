package day9;

import java.util.Scanner;

public class ArrayInputException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=s.nextInt();
		int a[]=new int[size];
		
		
		for(int i=0;i<a.length;i++) {

			System.out.println("values at a["+ i +"]=");
			a[i]=s.nextInt();

			
		}
		System.out.println();
		
		System.out.println("Enter the Index");
		int index=s.nextInt();
		try {
				System.out.println("Value of the array at index " + index +" is " + a[index]);
			}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The length of array is " +a.length);
			
		}
		

	}

}
