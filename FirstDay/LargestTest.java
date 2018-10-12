package FirstDay;

import static org.junit.Assert.*;

import org.junit.Test;

public class LargestTest {
	Largest l=new Largest();
	int arr1[]={3,7,8,0,1};
	int arr2[]={8,7,3};
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertArrayEquals(arr2,l.large(arr1));
	}

}
