package codes;
import java.util.*;
public class Sentence {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=s.nextLine();
		 String[] words = str.split(" ");
			System.out.println("Enter the word to be deleted:");
		 String word=s.next();
			System.out.println("Enter the word position in the sentence:");
			int pos=s.nextInt();
			int count=1;
			for(int i=0;i<words.length;i++)
			{
				if(!words[i].equals(""))
				{
					if(!words[i].equals(word) || count!=pos )
						System.out.print(words[i]+" ");
					count++;
				}
			}
			s.close();

}
}

