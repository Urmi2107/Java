package ExceptionExamples;

@SuppressWarnings("serial")
public class StringTooLongException extends Exception{
	public StringTooLongException(String s)
	{
		super(s);
	}

}
