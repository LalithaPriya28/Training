package assignment2;

public class AscendingOrder {

	public static void main(String[] args) {

		int a[]={99,5,73,837,153,737,772,1325,15,39,94,87};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int temp=0;
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}

		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}
}
