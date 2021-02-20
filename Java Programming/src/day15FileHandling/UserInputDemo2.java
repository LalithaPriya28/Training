package day15FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserInputDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ID: ");
		int id=s.nextInt();
		
		System.out.println("Enter Name: ");
		String name=s.next();
		
		FileWriter fw1=new FileWriter("abc2.txt",true);
		BufferedWriter bw1 =new BufferedWriter(fw1);
		
		bw1.write("=================");
		bw1.newLine();
		bw1.write("Id: "+ id);
		bw1.newLine();
		bw1.write("Name: "+ name);
		bw1.newLine();
		bw1.write("=================");
		
		bw1.flush();
		bw1.close();
	}

}
