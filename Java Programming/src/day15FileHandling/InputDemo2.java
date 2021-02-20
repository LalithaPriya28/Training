package day15FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter ID: ");
		int id=scan.nextInt();
		
		System.out.println("Enter Name: ");
		String name=scan.next();
		
		System.out.println("Enter Salary: ");
		int salary=scan.nextInt();
		
		FileWriter fw2=new FileWriter("abc2.txt",true);
		BufferedWriter bw2 =new BufferedWriter(fw2);
		
		
		bw2.newLine();
		bw2.write("Id"+ "\t ");
		bw2.write("Name"+"\t ");
		bw2.write("Salary"+"\t ");
		bw2.newLine();
		bw2.write(id+"\t ");
		bw2.write(name+"\t ");
		bw2.write(salary+"\t ");
		
		bw2.flush();
		bw2.close();
	}

}
