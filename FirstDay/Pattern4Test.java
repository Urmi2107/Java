package FirstDay;

import static org.junit.Assert.*;

import org.junit.Test;

public class Pattern4Test {

	Pattern4 p4=new Pattern4();
	String pat4="A\nBB\nCCC\nDDDD\nEEEEE\n";
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(pat4, p4.match4(5));
		
	}

}
