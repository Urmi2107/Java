package pkgStream;
import java.util.*;
import java.util.stream.*;

public class EmployeeService {
	public double sumSalary(List<Employee>e)
	{
		double sum=0;
		Stream<Employee>s=e.stream();
		sum=s.mapToDouble(obj->obj.getSalary()).sum();
		return sum;
	}
	public void countDepartment(List<Employee>e)
	{
		 Stream<Employee>e1=e.stream();
		 Object[]o=e1.filter(obj->obj.getDepartment()!=null).toArray();
		 Map<String,Integer>m=new HashMap<String,Integer>();
		 for(Object t:o)
		 {
			 Employee em=(Employee)t;
			 String str=em.getDepartment().getDepartmentName();
			 Integer count=m.get(str);
			 m.put(str,(count==null)?1:count+1);
						 
		 }
		 System.out.println(m);
		 
	}
	public void employeeWithoutDept(List<Employee>e)
	{
		Stream<Employee>s=e.stream();
		s.filter(obj->obj.getDepartment()==null).forEach((obj->System.out.println(obj.getFirstName()+" "+obj.getLastName())));
	}
	public void empSalary(List<Employee>e)
	{
		Stream<Employee>s=e.stream();
		s.forEach(obj->System.out.println(obj.getFirstName()+" "+obj.getLastName()+" "+obj.getSalary()+" "+obj.getSalary()+(0.15)*obj.getSalary()));
	}
	public void employeeWithoutManager(List<Employee>e)
	{
		Stream<Employee>s=e.stream();
		s.filter(obj->obj.getManagerId()==null).forEach((obj->System.out.println(obj.getFirstName()+" "+obj.getLastName())));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee>emp=EmployeeRepository.getEmployees();
		//List<Department>dept=EmployeeRepository.getDepartments();
		EmployeeService empS=new EmployeeService();
		System.out.println(empS.sumSalary(emp));
        empS.countDepartment(emp);
        empS.employeeWithoutDept(emp);
        empS.empSalary(emp);
        empS.employeeWithoutManager(emp);
	}

}
