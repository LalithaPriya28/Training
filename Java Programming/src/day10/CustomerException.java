package day10;

class LateException extends RuntimeException
{
	String msg;
	public LateException(String msg) {
		super(msg);
		this.msg=msg;
	}
}
class StudentAttendance
{
	public void LogIntime(int time) {
		if(time>9) {
			throw new LateException("You are absent");
		}
		else
			System.out.println("You are Present" );
	}
}

public class CustomerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentAttendance studentAttendance= new StudentAttendance();
		try {
		studentAttendance.LogIntime(11);
		}
		catch(LateException e) {
			System.out.println("Come before 9");
		}
	}

}
