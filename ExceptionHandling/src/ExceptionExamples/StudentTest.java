package ExceptionExamples;
import java.util.*;
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String name,course;
		int age, roll;
		System.out.println("Enter the details of student");
		roll=s.nextInt();
		name=s.next();
		age=s.nextInt();
		course=s.next();
		try
		{
			@SuppressWarnings("unused")
			Student s1=new Student(roll,name,age,course);
					
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			s.close();
		}

	}

}
