package day10;

import java.io.IOException;

class Attendance{
	public void LogIntime(int time) throws IOException{
		if(time>9) {
			//throw new ArithmeticException("You are absent");
			throw new IOException("You are absent");
		}
		else
			System.out.println("You are Present");
	}
	
}

public class ThrowsDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Attendance attendence =new Attendance();
		attendence.LogIntime(8);
		
		

	}

}