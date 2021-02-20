package day12Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList o=new ArrayList(100);
		System.out.println("size "+o.size());
		System.out.println(o);
		o.add("Sachin");
		o.add(1);
		System.out.println("size "+o.size());
		System.out.println(o);
		o.add(1, 100.8484);
		System.out.println(o);
		System.out.println("size "+o.size());
		o.remove(Integer.valueOf(100));
		System.out.println(o);
		System.out.println("Checking if the value is in the list "+o.contains(100.8484));
		System.out.println("The value at an index "+o.get(2));
		
		
		ArrayList o1=new ArrayList(100);
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		System.out.println("Array list o1 "+o1);
		
		
		ArrayList o2=new ArrayList(100);
		o2.add(2);
		o2.add(3);
		o2.add(4);
		o2.add(5);
		System.out.println("Arraylist o2 is "+o2);
		
		o2.addAll(o1);
		System.out.println("After add all "+o2);
		
		//o2.removeAll(o1);
		//System.out.println("After remove all"+o2);
		
		o2.retainAll(o1);
		System.out.println("After Retain all "+o2);//
		Collections.sort(o2);
		System.out.println("After Sort "+ o2);
		
		Collections.reverse(o2);
		System.out.println("After Reverse "+o2);
	}

}
