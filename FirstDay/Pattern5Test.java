package FirstDay;

import static org.junit.Assert.*;

import org.junit.Test;

public class Pattern5Test {

	Pattern5 p5=new Pattern5();
	String pat5="    *\n   **\n  ***\n ****\n*****\n";
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(pat5, p5.match5(5));
	}

}
