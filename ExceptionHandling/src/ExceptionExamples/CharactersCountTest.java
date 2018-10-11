package ExceptionExamples;
import java.util.*;
public class CharactersCountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		CharactersCount c1=new CharactersCount();
		String str="";
		System.out.println("enter the strings:");
		try
		{
		do
		{
			str=s.next();
			if(str.equalsIgnoreCase("done"))
				break;
			else
				c1.count(str);
		}while(!(str.equalsIgnoreCase("done")));
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
