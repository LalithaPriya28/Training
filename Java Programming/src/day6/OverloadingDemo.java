package day6;

public class OverloadingDemo {
	
	void dispInfo(String name,int id) {
		System.out.println("Name:"+" "+name);
		System.out.println("id:"+" "+id);
	}
	void dispInfo(int id,String name) {
		System.out.println("Name:"+" "+name);
		System.out.println("id:"+" "+id);
	}
	
	/*void dispInfo(int rollNumber,String name) {
		System.out.println("Name:"+" "+name);
		System.out.println("id:"+" "+rollNumber);
	}*/

	public static void main(String[] args) {
		
		OverloadingDemo od=new OverloadingDemo();
		od.dispInfo(23, "Lalitha");
		od.dispInfo("Priya", 58);
	}

}
