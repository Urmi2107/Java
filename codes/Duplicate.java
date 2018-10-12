package codes;
import java.util.*;
public class Duplicate {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=s.nextInt();
		System.out.println("Enter the elements of the array:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		System.out.println("Enter the difference:");
		int k=s.nextInt();
		s.close();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr[j] && Math.abs(i-j)<=k && i!=j)
				{
					System.out.println("True");
					return;
				}
				
			}
		}
		System.out.println("False");
		
		
	}
}
