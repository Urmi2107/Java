package codes;
import java.util.*;
public class IncomeTax {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the CTC:");
		double salary=s.nextDouble();
		double tax=0.0;
		if(salary>=0 && salary<=180000)
			tax=0.0;
		else if(salary>=181001 && salary<=300000)
			tax=0.1*salary;
		else if(salary>=300001 && salary<=500000)
			tax=0.2*salary;
		else if(salary>=500001 && salary<=1000000)
			tax=0.3*salary;
		System.out.println("The calculated tax is:"+tax);
		s.close();
	}
		

}
