package testInheritance;

public class Manager extends Employee {

	public Manager(long Id, String name, String address, long phone,double salary) {
		super(Id, name, address, phone);
		// TODO Auto-generated constructor stub
		basicSalary=salary;
	}
	@Override
	public void calculateTransportAllowance()
	{
		double transportAllowance=0.0;
		transportAllowance=15*basicSalary/100;
		System.out.println("The calculated transport allowance="+transportAllowance);
		
	}
	

}
