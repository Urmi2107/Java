
package pkgEmployee;
import java.util.*;
public class EmpDemo 
{
	
	public static void main(String args[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of employees:");
		n=s.nextInt();
		Emp[] obj=new Emp[n];
		for(int i=0;i<n;i++)
		{
			obj[i]=new Emp();
		}
		for(int i=0;i<n;i++)
		{
			obj[i].empNo=s.nextInt();
			obj[i].last=s.next();
			obj[i].first=s.next();
			obj[i].middle=s.next().charAt(0);
			obj[i].dept=s.next();
			obj[i].spanish=s.nextBoolean();
			obj[i].degree=s.next();
			obj[i].year=s.nextInt();
					
		}
		 Calendar now = Calendar.getInstance();
		 int currYear=(int)now.get(Calendar.YEAR);
		 System.out.println("South American Trainer Candidates");
		for(int i=0;i<n;i++)
		{
			if(obj[i].spanish==true && (currYear-obj[i].year>=5) && obj[i].degree.compareTo("BA")>=1)
				System.out.println("Last Name:"+obj[i].last+" First Name:"+obj[i].first+" Middle Initial:"+obj[i].middle+" Department:"+obj[i].dept);
		}
		
		s.close();
	}
}
