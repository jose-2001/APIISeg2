package exceptions;

@SuppressWarnings("serial")
public class PersonIsUnderageException extends Exception{

	public PersonIsUnderageException() {
		super("Esta persona es menor de edad y no puede entrar");
	}
}
