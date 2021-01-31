package assignment1;

public class PrintingPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prime numbers from 1 to 100 are :");
		int i =0;
		int j =0;

		String  primeNumbers = "";

		for (i = 10; i <= 100; i++)         
		{ 		  	  
			int counter=0; 	  
			for(j =i; j>=1; j--)
			{
				if(i%j==0)
				{
					counter = counter + 1;
				}
			}
			if (counter ==2)
			{


				primeNumbers = primeNumbers + i + " ";

			}	

		}	
		System.out.println(primeNumbers);

	}
}
