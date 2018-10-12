package pkgPolymorphism;

public class Square extends Rectangle {
	protected double side;
	public Square()
	{
		super();
		side=0.0;
	}
	public Square(double side)
	{
		super();
		this.side=side;
	}
	public Square(double side,String color,boolean filled)
	{
		super(side,side,color,filled);
		this.side=side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
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
	public String toString() {
		// TODO Auto-generated method stub
		String str="Sqaure[side="+side+",color="+color+",filled="+filled+"]";
		return str;
	}
}

	
