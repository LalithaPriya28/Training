package day13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list=new ArrayList();
		list.add(2);
		
		LinkedList l1=new LinkedList();
		l1.add(list);
		l1.add(12);
		l1.add(23);
		l1.addFirst(58);
		l1.addLast(45);
		l1.add(25);
		System.out.println("Linked list "+l1);
		
		l1.removeFirst();
		System.out.println("After removing first element " +l1);
		
		l1.removeLast();
		
		System.out.println("After removing last element " +l1);
		

	}

}
