package pkgCollections;
import java.util.*;
public class Shop {
	public static void main(String ag[]) throws Exception
	{
		MyShopping m=new MyShopping();
		Date d=new Date();
		try
		{
		Order o=new Order("O701", "Fruits", d); 
		Customer c=new Customer(1, "Urmi");
		m.storeRecord(c, o);
		m.getRecord(c);
		o=new Order("O8", "Grocery", d); 
		c=new Customer(2, "ABC");
		m.storeRecord(c, o);
		m.getRecord(c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}


}
