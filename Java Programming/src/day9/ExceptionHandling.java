package day9;

public class ExceptionHandling   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[]=new int[5];
			System.out.println("1");
			System.out.println("2");
			
			try {
				a[6]=20;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Please check the number of elements in the array");
			}
			try{
				System.out.println(3/2);
				
				}
			catch(ArithmeticException ex) {
				System.out.println("Do not give 0 in the denominator");
			}
			System.out.println("4");
			System.out.println("5");
			
			
			
		
			
	}

}
