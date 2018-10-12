package FirstDay;

import static org.junit.Assert.*;

import org.junit.Test;

public class MissingTest {

	Missing m=new Missing();
	int arr[]={1,2,3,5,6};
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(4, m.num(arr));
	}

}
