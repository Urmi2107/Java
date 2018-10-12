package codes;
import java.util.*;
public class RemoveDuplicate {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=s.next();
		String str2="";
		int f=0;
       
        for(int i=0; i<str.length(); i++)
        {
        	f=0;
           for(int j=0;j<str2.length();j++)
           {
        	   if(str.charAt(i)==str2.charAt(j))
        	   {
        		   f=1;
        		   break;
        	   }
           }
           if(f==0)
        	   str2+=str.charAt(i);
	}
        System.out.println("String after removing duplicates:"+str2);
        s.close();

}
}

