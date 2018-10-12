package pkgString;

public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("This is StringBuffer");
		System.out.println("String after append:"+s.append("- This is a sample program"));
		System.out.println("String after insertion:"+s.insert(20, "Object"));
		System.out.println("Reverse of the string:"+s.reverse());
		s.reverse();
		System.out.println("Replacing the word:"+s.replace(14, 20, "Builder"));
		

	}

}
