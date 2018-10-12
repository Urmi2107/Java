package FirstDay;

import static org.junit.Assert.*;

import org.junit.Test;

public class SwapTest {

	Swap s=new Swap();
	int arr[]={12,21};
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertArrayEquals(arr,s.interchange(21,12));
		
		
	}

}
