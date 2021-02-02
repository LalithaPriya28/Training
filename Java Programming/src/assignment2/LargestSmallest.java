package assignment2;
import java.util.Arrays;
public class LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={99,5,73,837,153,737,772,1325,15,39,94,87};
		int max=a[0],min=a[0];
		int length=a.length;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("The largest number is" +" "+max);
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("The smallest number is" +" "+min);
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}
		System.out.println("The smallest numbers are:"+ " " +a[0] + " " +a[1] );
		System.out.println("The Largest numbers are:"+ " " +a[length-1] + " " +a[length-2] );
		
		
		
}

}
