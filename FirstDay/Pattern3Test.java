package FirstDay;

import static org.junit.Assert.*;

import org.junit.Test;

public class Pattern3Test {

	String pat3="*****\n****\n***\n**\n*\n";
	Pattern3 p3=new Pattern3();
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(pat3, p3.match3(5));
	}

}
