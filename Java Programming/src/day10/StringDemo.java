package day10;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Sachin";
		String s2="Sachin";
		String s3="sachin";
		String s4=new String("Priya");
		String s5=new String("Priya");
		String s6=new String("priya");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s4==s5);
		System.out.println(s5==s6);
		System.out.println(s1.equals(s2));
		System.out.println(s4.equals(s5));
		
		StringBuffer sb=new StringBuffer("Lalitha");
		sb.append("Priya");
		System.out.println(sb);
		

	}

}
