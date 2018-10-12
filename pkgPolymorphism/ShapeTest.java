package pkgPolymorphism;
import java.util.*;
public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double radius=0.0,length=0.0,width=0.0,side=0.0;
		boolean filled=false;
		String color="";
		System.out.println("Enter radius,color and filled for circle:");
		radius=sc.nextDouble();
		color=sc.next();
		filled=sc.nextBoolean();
		Circle c=new Circle(radius,color,filled);
		System.out.println("For circle:");
		System.out.println("Area="+c.getArea()+" Perimeter="+c.getPerimeter());
		System.out.println("Details="+c.toString());
		System.out.println("Enter width,length,color and filled for Rectangle:");
		width=sc.nextDouble();
		length=sc.nextDouble();
		color=sc.next();
		filled=sc.nextBoolean();
		Rectangle r=new Rectangle(width,length,color,filled);
		System.out.println("For Rectangle:");
		System.out.println("Area="+r.getArea()+" Perimeter="+r.getPerimeter());
		System.out.println("Details="+r.toString());
		System.out.println("Enter side,color and filled for Sqaure:");
		
		side=sc.nextDouble();
		color=sc.next();
		filled=sc.nextBoolean();
		sc.close();
		Square s=new Square(side,color,filled);
		System.out.println("For Sqaure:");
		System.out.println("Details="+s.toString());
		
		

	}

}
