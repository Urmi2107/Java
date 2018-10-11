package ExceptionExamples;

public class Factorial {
	public  int getFactorial(int num)throws InvalidInputException,FactorialException
	{
		int fact=1;
		double fact1=1;
		if(num<2)
			throw new InvalidInputException("Number can not be less than 2");
		else
		{
		for(int i=1;i<=num;i++)
			fact1=fact1*i;
		if(fact1>Integer.MAX_VALUE)
			throw new FactorialException("Factorial exceeded max value of int");
		
		}
		fact=(int)fact1;
		return fact;
	}

}
