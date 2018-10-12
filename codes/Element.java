package codes;
import java.util.*;
public class Element {
	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		int rows=s.nextInt();
		int cols=s.nextInt();
		int arr[][]=new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter the element to be searched:");
		int elem=s.nextInt();
		s.close();	
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(arr[i][j]==elem)
				{
					
					System.out.println(elem+" is found");
					return;
				}
			}
		}
		
		System.out.println(elem+" is not found");
			
	}
}
