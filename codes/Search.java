package codes;
import java.util.*;
public class Search {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the length of the array:");
		int n=s.nextInt();
		String str1[]=new String[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++)
		{
			str1[i]=s.next();
		}
		System.out.println("Enter the string to be searched:");
		String str2=s.next();
		int count=0;
		for(int i=0;i<str1.length;i++)
		{
			if(str1[i].equals(str2))
				count++;
		}
		if(count==0)
		System.out.println(str2+" not found!");
		else
			System.out.println(str2+" found "+count+" times.");
		s.close();
		
	}

}
