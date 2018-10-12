package pkgString;

public class WelcomeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome to Java World";
		System.out.println("Character at 5th position:"+str.charAt(4));
		System.out.println("Comparing the string with 'Welcome' is:"+str.compareToIgnoreCase("Welcome"));
		str=str+"-Let us learn";
		System.out.println("The new concatenated string is:"+str);
		System.out.println("The first occurence of 'a':"+str.indexOf('a'));
		System.out.println("Replacing all occurences of a with e:"+str.replace('a', 'e'));
		System.out.println("String between 4th position and 10th position:"+str.substring(3, 10));
		System.out.println("Lowercase of the string :"+str.toLowerCase());

	}

}
