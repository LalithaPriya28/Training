package day11;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="apple";
		
		System.out.println(s1.concat("hello"));
		
		System.out.println(s1.length());
		
		System.out.println(s1.indexOf('p'));
		
		System.out.println(s1.charAt(2));
		
		System.out.println(s1.substring(1));
		
		System.out.println(s1.substring(1, 3));
		
		System.out.println(s1.replace('p', 'u'));
		
		System.out.println(s1.equals("happy"));
		
		System.out.println(s1.trim());
		
		System.out.println(s1.equalsIgnoreCase("APpLE"));
		
		System.out.println(s1.compareTo("ap"));
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.toLowerCase());
		
	
	}

}
