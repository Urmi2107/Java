package FirstDay;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZeroesTest {
	
	int arr1[]={2,4,0,7,0,9};
	int arr2[]={2,4,7,9,0,0};
	Zeroes z=new Zeroes();
	@Test
	public void testZeroes() {
		//fail("Not yet implemented");
		assertArrayEquals(arr2,z.zero(arr1));
		
	}

}
