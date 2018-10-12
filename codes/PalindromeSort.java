package codes;
import java.util.*;
public class PalindromeSort {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=10,count=0;
		String str;
		String arr[]=new String[n];
		String a[]=new String[n];
		
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.next();
			
			str="";
			  for(int j=arr[i].length()-1;j>=0;j--)
				  str+=arr[i].charAt(j);
			  if (arr[i].equals(str))
			  {
				  a[count]=arr[i];
				  count++;
			  }
		}
		int len[]=new int[count];
		for(int i=0;i<count;i++)
		{
			len[i]=a[i].length();
		}
		String temp="";
		int temp1=0;
		for(int i=0;i<count-1;i++)
		{
			for(int j=0;j<count-1-i;j++)
			{
				if(len[j]<len[j+1])
				{
					temp1=len[j];
					len[j]=len[j+1];
					len[j+1]=temp1;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		System.out.println("In descending order:");
		for(int i=0;i<count;i++)
			System.out.println(a[i]);
		s.close();
		
	}

}
