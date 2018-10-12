package codes;
import java.util.*;
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double r=0.0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius:");
		r=s.nextDouble();
		Circle ob1=new Circle(r);
		System.out.println("Radius of the circle is:"+ob1.getRadius());
		System.out.println("Area of the circle is:"+ob1.getArea());
		
		s.close();

	}

}
