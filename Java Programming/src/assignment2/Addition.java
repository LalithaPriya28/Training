package assignment2;

public class Addition {

	public static void main(String[] args) {


		int a[][]={{1,2,5},{32,4,3},{33,44,65}};    
		int b[][]={{51,3,94},{21,14,3},{21,2,44}};    
		int c[][]=new int[3][3];    
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				c[i][j]=a[i][j]+b[i][j];    
				System.out.print(c[i][j]+" ");    
			}    
			System.out.println();    
		}    
	}
}

	
