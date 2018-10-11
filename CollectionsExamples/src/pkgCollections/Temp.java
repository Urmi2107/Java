package pkgCollections;

import java.util.*;

public class Temp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pid="",pname="",desc="";
		TreeMap<Product,String> hm=new TreeMap<Product,String>();  
		Scanner s=new Scanner(System.in);
		Product p;
		for(int i=1;i<=5;i++)
		{
			pid=s.next();
			pname=s.next();
			desc=s.next();
			p=new Product(pid,pname);
			hm.put(p,desc);
		}
		for(Map.Entry<Product,String> m:hm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue()); 

	}

}
}
