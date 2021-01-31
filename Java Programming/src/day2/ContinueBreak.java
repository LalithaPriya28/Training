package day2;

public class ContinueBreak {

	public static void main(String[] args) {
		for(int i=1;i<5;i++) 
		{
			System.out.println(i+ "hi");
			 if(i==2)
			 {
				 break;
					
			}
			System.out.println(i+ "hello");
		}
		System.out.print("ThankYou");
	
		System.out.println("");
		
		
		for(int i=1;i<5;i++) 
		{
			System.out.println(i + " hi");
			 if(i==2)
			 {
				 continue;
					
			}
			System.out.println(i + " bye");
		}
		System.out.print("Thank You");
		// TODO Auto-generated method stub

	}

}
