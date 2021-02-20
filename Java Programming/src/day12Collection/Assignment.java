package day12Collection;
import java.util.*;

public class Assignment {

	public static void main(String[] args) {
		
		ArrayList<String> javaBatch= new ArrayList<String>();
		javaBatch.add("Priya");
		javaBatch.add("Akshay");
		javaBatch.add("Apoorva");
		javaBatch.add("Sravani");
		javaBatch.add("Preethi");
		
		System.out.println("The students in java batch are "+javaBatch);
		
		ArrayList<String> softSkill= new ArrayList<String>();
		softSkill.add("Priya");
		softSkill.add("Akshay");
		softSkill.add("Lakshmi");
		softSkill.add("Chitra");
		softSkill.add("Deepali");
		
		System.out.println("The students in Soft skill batch are "+softSkill);
		
		
		softSkill.removeAll(javaBatch);
		System.out.println(" "+softSkill);
		
		softSkill.addAll(javaBatch);
		System.out.println("After adding "+softSkill);
		
		Collections.sort(softSkill);
		System.out.println("After Sorting "+softSkill);
		
		
		
		
		

	}

}
