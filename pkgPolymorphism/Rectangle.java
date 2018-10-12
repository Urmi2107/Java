package pkgPolymorphism;

public class Rectangle extends Shape{
	protected double width,length;
	public Rectangle()
	{
		width=length=0.0;
	}
	public Rectangle(double width,double length)
	{
		this.width=width;
		this.length=length;
		
	}
	public Rectangle(double width,double length,String color,boolean filled)
	{
		super(color,filled);
		this.width=width;
		this.length=length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*width;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(length+width);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str="Rectangle[width="+width+",length="+length+"color="+color+"filled="+filled+"]";
		return str;
	}
	
}
