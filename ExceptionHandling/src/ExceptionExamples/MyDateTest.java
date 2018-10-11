package ExceptionExamples;

public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		MyDate d1;
		try
		{
		for(int i=0;i<args.length;i++)
		{
			d1=new MyDate(args[i]);
		}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

}
