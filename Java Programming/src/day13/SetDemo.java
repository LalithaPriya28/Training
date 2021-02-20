package day13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet h=new HashSet();
		h.add("Lalitha");//takes duplicate but prints only one value
		h.add("a");
		h.add(23);
		h.add("58");
		h.add("a");
		
		System.out.println("Hash Set "+h);
		
		
		LinkedHashSet lh=new LinkedHashSet();
		lh.add("Lalitha");//takes duplicate but prints only one value
		lh.add("a");
		lh.add(23);
		lh.add("58");
		lh.add("a");
		
		System.out.println("Linked HashSet "+lh);
		
		TreeSet t=new TreeSet(); //takes input of same type
		
		t.add("lalitha"); //gives output in ascending order
		t.add("a"); //takes duplicate but prints only one value
		t.add("b");
		t.add("a");
		
		System.out.println("Tree Set "+t);
		
		
	}

}
