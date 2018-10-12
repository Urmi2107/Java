package FirstDay;

import static org.junit.Assert.*;

import org.junit.Test;

public class Swap2Test {
	Swap2 s2=new Swap2();
	int arr[]={78,87};
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertArrayEquals(arr,s2.interchange(87,78));
		
	}

}
