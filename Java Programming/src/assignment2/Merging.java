package assignment2;

public class Merging {

	public static void main(String[] args) {
		

				int a[] = { 17,344,112,4,55,25}; 
				
				int b[] = { 411,510,64,6,21}; 

				int l1 = a.length; 
				 
				int l2 = b.length; 

				int l3 = l1 + l2; 

				int[] c = new int[l3]; 

			
				for (int i = 0; i < l1; i = i + 1) { 
					
					c[i] = a[i]; 
				} 

				for (int i = 0; i < l2; i = i + 1) { 

					c[l1 + i] = b[i]; 
				} 

				for (int i = 0; i < l3; i = i + 1) { 
					
					System.out.print(c[i]+ " "); 
				} 
			} 
		


	
}
