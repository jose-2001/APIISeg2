package exceptions;

@SuppressWarnings("serial")
public class NotAssignedDayException extends Exception{
	
	public NotAssignedDayException (String msg) {
		super(msg);
	}
}
