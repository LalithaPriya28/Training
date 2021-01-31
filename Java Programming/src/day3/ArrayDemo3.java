package day3;

public class ArrayDemo3 {
	public static void main(String[] args) {


		int a[]= {1,6,9,7,4,8};
		String odd= "" ;
		String even= "";
		int evencount=0;
		int oddcount=0;

		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) { 
				even= even+ " " + a[i];
				evencount++;
				
			}
			else {
				odd= odd+" "+ a[i];
				oddcount++;
				
				
			}



		}
		System.out.println("even numbers are" + even);
		System.out.println("Total no of even numbers are" + evencount);
		System.out.println("odd numbers are" + odd);
		System.out.println("Total number of odd numbers are" + oddcount);
	}
}
