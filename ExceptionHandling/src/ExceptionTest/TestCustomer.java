package ExceptionTest;
import java.util.*;
public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String custNo="",custName="",category="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter customer number,name and category:");
		custNo=s.next();
		custName=s.next();
		category=s.next();
		try
		{
			Customer c=new Customer(custNo,custName,category);
			System.out.println("Customer details");
			System.out.println("Customer no.:"+c.getCustNo());
			System.out.println("Customer name:"+c.getCustName());
			System.out.println("Category:"+c.getCategory());
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
