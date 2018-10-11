package ExceptionExamples;
import java.util.*;
import java.util.regex.Pattern;
public class InputNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int c=0;
		float sum=(float) 0.0;
		String s1="";
		try
		{
			System.out.println("Enter the number of elements:");
			int n=s.nextInt();
			System.out.println("Enter the elements:");
			do
			{
				
				s1=s.next();
				if(!Pattern.matches("[0-9]*[.]{0,1}[0-9]*", s1))
				{
					c++;
					if(c==1)
						System.out.println("Re-enter the element:");
				if(c==2)
					throw new InputNumberException("The element is not float number");
				}
				else
				{
					sum+=Float.parseFloat(s1);
					n--;
					
				}
				
			}while(n!=0);
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			System.out.println("The sum is:"+sum);
			s.close();
		}
	}

}
