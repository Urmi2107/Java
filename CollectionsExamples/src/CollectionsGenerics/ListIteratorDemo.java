package CollectionsGenerics;
import java.util.*;
public class ListIteratorDemo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> l=new LinkedList<String>();
		l.add("balakrishna");
		l.add("venki");
		l.add("chiru");
		l.add("nag");
		System.out.println(l);
		ListIterator itr=l.listIterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			if(s.equals("venki"))
				itr.remove();
		}
		System.out.println("Backward direction");
		while(itr.hasPrevious()){
		System.out.println(itr.previous());
	

	}
	}
}
