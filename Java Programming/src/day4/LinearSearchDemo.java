package day4;

public class LinearSearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {299,5,56,855,246,99};
		
		int findNumber=99;
		int location=0;
		int flag=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==findNumber)
			{
				flag=1;
				location=i;
				break;
				
			}
		}
		if(flag==1)
		{
			System.out.println("element is found at"+ " "+ location+"th"+ " " + "position" ); 
		}
		else
			System.out.println("element not found!");
	}

}
