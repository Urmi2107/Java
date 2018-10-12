package FirstDay;

import static org.junit.Assert.*;

import org.junit.Test;

public class Pattern1Test {

	Pattern1 p1=new Pattern1();
	String pat1="  1\n 121\n12321\n";
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(pat1, p1.match1(3));
		
	}

}
