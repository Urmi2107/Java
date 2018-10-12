package testInheritance;

public class Trainee extends Employee {
	public Trainee(long Id, String name, String address, long phone,double salary) {
		super(Id, name, address, phone);
		// TODO Auto-generated constructor stub
		basicSalary=salary;
	}
	
}
