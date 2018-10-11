package ExceptionExamples;

public class Student {
	int rollno;
	int age;
	String name;
	String course;
	public Student(int rollno,String name,int age,String course)throws AgeNotWithinRangeException,NameNotValidException
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		this.course=course;
		if(age<15 || age>21)
			throw new AgeNotWithinRangeException("Age should be between 15 and 21");
		for(int i=0;i<name.length();i++)
		{
			if(!(name.charAt(i)==' '|| (name.charAt(i)>='A' && name.charAt(i)<='Z') || (name.charAt(i)>='a'&& name.charAt(i)<='z')))
				throw new NameNotValidException("Name should not contain numbers or special symbols");
		}
	}
	

}
