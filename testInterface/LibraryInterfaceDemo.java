package testInterface;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("For Kids:");
		KidUser k=new KidUser();
		k.age=10;
		k.registerAccount();
		System.out.println();
		k.age=18;
		k.registerAccount();
		System.out.println();
		k.bookType="Kids";
		k.requestBook();
		System.out.println();
		k.bookType="Fiction";
		k.requestBook();
		System.out.println();
		System.out.println("For Adults:");
		AdultUser a=new AdultUser();
		a.age=5;
		a.registerAccount();
		System.out.println();
		a.age=23;
		a.registerAccount();
		System.out.println();
		a.bookType="Kids";
		a.requestBook();
		System.out.println();
		a.bookType="Fiction";
		a.requestBook();
		System.out.println();

	}

}
