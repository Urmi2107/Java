package pkgPolymorphism;

public class Circle extends Shape {
	protected double radius;
	public Circle()
	{
		radius=0.0;
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public Circle(double radius,String color,boolean filled)
	{
		super(color,filled);
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		
		return (Math.PI *Math.pow(radius, 2));
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (2* Math.PI * radius);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str="Circle[radius="+radius+",color="+color+"filled="+filled+"]";
		return str;
		
	}

}
