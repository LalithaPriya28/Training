package test;

import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int children=0,adult=0,senior=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int size=scan.nextInt();
		int age[]=new int[size];

		for(int i=0;i<age.length;i++) {

			System.out.println("values at age["+ i +"]=");
			age[i]=scan.nextInt();
		}
		for(int i=0;i<age.length;i++)
		{
			if(age[i]<18) {
				children++;
			}
			else if(age[i]>18 && age[i]<54) {
				adult++;
			}
			else {
				senior++;
			}
		}
		System.out.println("Children: "+children);
		System.out.println("Adult: "+adult);
		System.out.println("Senior Citizen " +senior);

	}
}


	


