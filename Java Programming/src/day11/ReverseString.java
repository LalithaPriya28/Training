package day11;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="hello java";
		for(int i=0;i<name.length();i++) {
			
			char ch=name.charAt(i);
			System.out.print(ch +" ");
		}
		System.out.println(" ");
		
		for(int i=name.length()-1;i>=0;i--) {
			
			char ch=name.charAt(i);
			System.out.print(ch +" ");
		}
	}

}
