package FirstDay;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortTest {

	Sort st=new Sort();
	int arr1[]={6,8,2,0,7};
	int arr2[]={0,2,6,7,8};
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertArrayEquals(arr2, st.arrange(arr1));
	}

}
