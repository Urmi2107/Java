package ExceptionExamples;
import java.util.*;
public class FactorialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f=new Factorial();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		try
		{
			double f1=f.getFactorial(n);
			System.out.println("The factorial is:"+f1);
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			s.close();
		}

	}

}
