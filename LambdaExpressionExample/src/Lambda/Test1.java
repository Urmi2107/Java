package Lambda;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interf1 i=(a,b)->System.out.println("the sum is="+(a+b));
		i.add(10, 20);
		i.add(100, 200);
		i.add(1000, 2000);
		i.m1();
		Interf1.m2();

	}

}
