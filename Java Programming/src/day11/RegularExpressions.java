package day11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p= Pattern.compile("a");
		Matcher m= p.matcher("Lalitha");
		
		while(m.find()) {
			System.out.println("Matching starts at "+m.start()+ " ends at "+m.end()+" and matching is grouped by "+m.group());
		}
		System.out.println("========================================================");
		Matcher m1=Pattern.compile("p").matcher("Hippo");
		while(m1.find()) {
			System.out.println("Matching starts at "+m1.start()+ " ends at "+m1.end()+" and matching is grouped by "+m1.group());
		}
		System.out.println("========================================================");
		
		Matcher m2=Pattern.compile("[abc]").matcher("afcgfhfdyb");//searching only abc
		while(m2.find()) {
			System.out.println("Matching starts at "+m2.start()+ " ends at "+m2.end()+" and matching is grouped by "+m2.group());
		}
		System.out.println("========================================================");
		
		Matcher m3=Pattern.compile("[^abc]").matcher("ajolb");//searching everything except abc
		while(m3.find()) {
			System.out.println("Matching starts at "+m3.start()+ " ends at "+m3.end()+" and matching is grouped by "+m3.group());
		}
		System.out.println("========================================================");
		
		Matcher m4=Pattern.compile("[0-9]").matcher("afcgf193abhff");//searching only numbers
		while(m4.find()) {
			System.out.println("Matching starts at "+m4.start()+ " ends at "+m4.end()+" and matching is grouped by "+m4.group());
		}
		System.out.println("========================================================");
		
		Matcher m5=Pattern.compile("[A-Z]").matcher("aAJhff");//searching only ALPHABETS 
		//[a-z] for small alphabets 
		while(m5.find()) {
			System.out.println("Matching starts at "+m5.start()+ " ends at "+m5.end()+" and matching is grouped by "+m5.group());
		}
		System.out.println("========================================================");
		
		
		
	}

}
