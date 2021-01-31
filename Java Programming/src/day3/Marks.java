package day3;
import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=scan.nextInt();
		int marks[]=new int[size];
		System.out.println("size of the array is" +" "+marks.length);
		for( i=0;i<marks.length;i++) {

			System.out.println("values at marks["+ i +"]=");
			marks[i]=scan.nextInt();
		}
		int min=marks[0];
		int max=marks[0];
		for( i=0;i<marks.length;i++) {
		if(min>marks[i]) {
			min=marks[i];
		}
		if(max<marks[i]) {
			max=marks[i];
		}
		

	}
		System.out.println("The minimum mark is :" + min);
		System.out.println("The maximum mark is :" + max);
		int addition=0;
		for( i=0;i<marks.length;i++) {
			addition=addition + marks[i];
			}
		System.out.println("The Total marks obtained are :" + addition);
		if(min<45) {
			System.out.println("FAIL");
		}
		else {
			System.out.println("PASS");
		}
			

}
}
