package day3;

import java.util.Arrays;

public class ManipulatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,7,87,99,3,45};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		Arrays.sort(a);
		
		System.out.println("after sorting");
		for(int i=0;i<a.length;i++)
		{
			
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		int index=Arrays.binarySearch(a,99);
		System.out.println("The number is"
				+ " "
				+ "found at " +index);	
	}

}
