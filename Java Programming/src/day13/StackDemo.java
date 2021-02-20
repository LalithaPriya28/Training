package day13;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
	
		Stack s=new Stack();
		s.push(20);
		s.push(30);
		s.push(40);
		
		System.out.println("elements in stack "+s);
		System.out.println("top element in stack "+s.peek());
		System.out.println("removing top element in stack which is "+s.pop());
		System.out.println("elements in stack "+s);
		
		System.out.println("removing top element in stack which is "+s.pop());
		System.out.println("elements in stack "+s);
		
		
		
		
		

	}

}
