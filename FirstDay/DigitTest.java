package FirstDay;

import static org.junit.Assert.*;

import org.junit.Test;

public class DigitTest {
	Digit d=new Digit();
	int n=179;
	int s=17;
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(s, d.sum(n));
	}

}
