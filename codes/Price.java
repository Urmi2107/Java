package codes;
import java.util.*;
public class Price {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of the item:");
		double newItem=s.nextDouble();
		double discount=0.35*newItem;
		double newItemPrice=newItem-discount;
		System.out.println("The New Price="+newItemPrice);
		s.close();
	}
}
