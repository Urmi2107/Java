package pkgCollections;
import java.util.*;
public class EmployeeSavingsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee_information> l1=new ArrayList<Employee_information>();
		List<MMASaving_Account> l2=new ArrayList<MMASaving_Account>();
		Map<Employee_information,MMASaving_Account>m=new HashMap<Employee_information,MMASaving_Account>();
		Employee_information e1=new Employee_information("e101","urmi","analyst",7000,"e1");
		l1.add(e1);
		MMASaving_Account a1=new MMASaving_Account("a101","urmi",6000,true);
		l2.add(a1);
		m.put(e1, a1);
		 e1=new Employee_information("e102","dhruba","analyst",8000,"e2");
		l1.add(e1);
		a1=new MMASaving_Account("a102","dhruba",6000,true);
		l2.add(a1);
		m.put(e1, a1);
		 e1=new Employee_information("e103","abc","analyst",8000,"e3");
		l1.add(e1);
		a1=new MMASaving_Account("a103","abc",6000,true);
		l2.add(a1);
		m.put(e1, a1);
	 e1=new Employee_information("e104","xyz","analyst",7000,"e4");
		l1.add(e1);
		a1=new MMASaving_Account("a104","xyz",6000,true);
		l2.add(a1);
		m.put(e1, a1);
		 e1=new Employee_information("e105","qwe","analyst",8000,"e5");
		l1.add(e1);
		a1=new MMASaving_Account("a105","qwe",6000,true);
		l2.add(a1);
		m.put(e1, a1);
		for(Map.Entry<Employee_information,MMASaving_Account> m1:m.entrySet()){  
			   System.out.println(m1.getKey()+" "+m1.getValue());  
			  }  

	}

}
