package testInheritance;

public class Employee {
	long employeeId,employeePhone;
	String employeeName,employeeAddress;
	double basicSalary,specialAllowance=250.80, Hra=1000.50;
	
	public Employee(long Id,String name,String address,long phone)
	{
		employeeId=Id;
		employeeName=name;
		employeeAddress=address;
		employeePhone=phone;
		
	}
	public void calculateSalary()
	{
		double salary=0.0;
		salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
		System.out.println("The calculated salary="+salary);
	}
	public void calculateTransportAllowance()
	{
		double transportAllowance=0.0;
		transportAllowance=10*basicSalary/100;
		System.out.println("The calculated transport allowance="+transportAllowance);
		
	}
	
}
