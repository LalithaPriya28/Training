package day3;

import java.util.Scanner;

public class ArrayDemoInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=scan.nextInt();
		int marks[]=new int[size];
		System.out.println("size of the array is" + marks.length);
		for(int i=0;i<marks.length;i++) {

			System.out.println("values at marks["+ i +"]=");
			marks[i]=scan.nextInt();
		}
		System.out.println();
		for(int i=0;i<marks.length;i++) {

			System.out.println("values at marks["+ i +"]=" + marks[i]);
			
		}

	}

}
