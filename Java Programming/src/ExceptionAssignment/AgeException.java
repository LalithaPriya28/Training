package ExceptionAssignment;

public class AgeException extends RuntimeException {
public String message;
AgeException(String message){
	super(message);
	this.message=message;
	System.out.println("CHECKING THE FLOW");
}


}
