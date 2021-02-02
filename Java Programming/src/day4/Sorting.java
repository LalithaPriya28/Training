package day4;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,2,7,45,8,54,647,577,37};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+ " ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;i<a.length;j++)
			{
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k]+ " ");
		}
		System.out.println();
		
	
		
		System.out.println("after sorting");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i] + " ");
		}
	}

}
