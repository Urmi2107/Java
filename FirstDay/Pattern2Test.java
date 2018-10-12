package FirstDay;

import static org.junit.Assert.*;

import org.junit.Test;

public class Pattern2Test {
	Pattern2 p2=new Pattern2();
	String pat2="1\n12\n123\n1234\n12345\n";
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(pat2, p2.match2(5));
	}

}
