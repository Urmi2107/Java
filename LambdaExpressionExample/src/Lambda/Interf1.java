package Lambda;

public interface Interf1 {
	public void add(int a,int b);
	static void m2()
	{
		System.out.println("static method");
	}
	default void m1()
	{
		System.out.println("default method");
	}

}
