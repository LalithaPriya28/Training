package day10;
class Attendance{
	public void LogIntime(int time) {
		if(time>9) {
			throw new ArithmeticException("You are absent");
		}
		else
			System.out.println("You are Present");
	}
	
}

public class ThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Attendance attendence =new Attendance();
		attendence.LogIntime(8);
		
		

	}

}
