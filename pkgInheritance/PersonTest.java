package pkgInheritance;
import java.util.*;
public class PersonTest {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String name="",address="",program="",school="";
		double pay=0.0,fee=0.0;
		int year=0;
		System.out.println("Enter the details for student:");
		System.out.println("Enter the name:");
		name=s.next();
		System.out.println("Enter the address:");
		address=s.next();
		System.out.println("Enter the program:");
		program=s.next();
		System.out.println("Enter the year:");
		year=s.nextInt();
		System.out.println("Enter the fee:");
		fee=s.nextDouble();
		Student stu=new Student(name,address,program,year,fee);
		System.out.println("Displaying details for student:");
		System.out.println(stu.toString());
		System.out.println("Enter the details for staff:");
		System.out.println("Enter the name:");
		name=s.next();
		System.out.println("Enter the address:");
		address=s.next();
		System.out.println("Enter the school:");
		school=s.next();
		System.out.println("Enter the pay:");
		pay=s.nextDouble();
		s.close();
		Staff stf=new Staff(name,address,school,pay);
		System.out.println("Displaying details for staff:");
		System.out.println(stf.toString());
		
		
		
	}

}
