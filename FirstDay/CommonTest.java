package FirstDay;

import static org.junit.Assert.*;

import org.junit.Test;

public class CommonTest {
	Common cm=new Common();
	int a[]={2,3,5,6,10};
	int b[]={0,5,7,10};
	int c[]={2,3,5,10,11};

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals("5 10 ", cm.elem(a,b,c));
	}

}
