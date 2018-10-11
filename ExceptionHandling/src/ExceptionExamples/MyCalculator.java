package ExceptionExamples;

public class MyCalculator {
	public long power(int n,int p)throws Exception
	{
		long result=0;
		if(n<0 || p<0)
			throw new Exception("n or p should not be negative.");
		else if(n==0 || p==0)
			throw new Exception("n and p should not be zero.");
		else
			result=(long)Math.pow(n,p);
		
		
		return result;		
		
	}

}
