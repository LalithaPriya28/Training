package day5;

 	class Student {
	int id;
	String name;
	static String companyName="TCS";
	void disp()
	{
	System.out.println("id"+" "+id);
	System.out.println("Name"+" "+name);
	System.out.println("Company Name"+" "+companyName);
	}
}
 	public class StaticDemo2{
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.id=1;
		s1.name="Sachin";
		
		Student s2=new Student();
		s2.id=11;
		s2.name="Lalitha";
		
		Student s3=new Student();
		s3.id=13;
		s3.name="Sindhu";
		
		s3.companyName="Fujitsu";
		s1.disp();
		s2.disp();
	

	}

}
