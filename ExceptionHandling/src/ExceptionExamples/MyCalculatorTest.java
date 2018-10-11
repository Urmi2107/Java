package ExceptionExamples;
import java.util.*;
public class MyCalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,p=0;
		long res=0;
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("enter the the number and the power:");
			n=s.nextInt();
			p=s.nextInt();
			
		}while((n<-10 || n>10)||(p<-10 || p>10) );
		try
		{
			MyCalculator c=new MyCalculator();
			res=c.power(n, p);
			System.out.println(res);
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
