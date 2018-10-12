package codes;

public class Circle {
	private double radius;
	private String color;
	public Circle()
	{
		radius=1.0;
		color="Red";
	}
	public Circle(double r)
	{
		radius=r;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getArea()
	{
		return(Math.PI*Math.pow(radius,2));
	}

}
