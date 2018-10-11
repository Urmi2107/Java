package ExceptionExamples;

public class CharactersCount {
	public void count(String str)throws StringTooLongException
	{
		int l=str.length();
		if(l>20)
			throw new StringTooLongException("Too long String.String exceeds 20 characters");
	}

}
