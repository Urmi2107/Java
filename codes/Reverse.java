package codes;
import java.util.*;
public class Reverse
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=s.nextLine();
		str=str+" ";
		 String[] words = str.split(" ");
         
	        String revstr = "";
	         
	        for (int i = 0; i < words.length; i++) 
	        {
	            String word = words[i];
	             
	            String revword = "";
	             
	            for (int j = word.length()-1; j >= 0; j--) 
	            {
	                revword = revword + word.charAt(j);
	            }
	             
	            revstr = revstr + revword+" ";
	    
	       
	}
	        System.out.println(revstr);
	        s.close();
}
}