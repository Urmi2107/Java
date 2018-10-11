package pkgCollections;
import java.util.*;
public class MyShopping {
	 Hashtable < Customer, Order > h=new Hashtable<>();
	public void storeRecord(Customer c, Order od)
	{
		h.put(c, od);
	}
	public void getRecord(Customer c)
	{
		System.out.print(c.toString()+" ");
		System.out.println(h.get(c).toString());
	}
	

}
