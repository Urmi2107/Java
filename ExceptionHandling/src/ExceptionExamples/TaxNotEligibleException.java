package ExceptionExamples;

@SuppressWarnings("serial")
public class TaxNotEligibleException extends Exception {
	public TaxNotEligibleException(String s)
	{
		super(s);
	}

}
