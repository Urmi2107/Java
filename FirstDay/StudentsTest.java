package FirstDay;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentsTest {

	Students st=new Students();
	int arr1[]={59,80,88,60,66,70,77,79,89,72,71,68,90,93,95,97,68,62,61,63};
	int c=6;
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(c,st.count(arr1));
	}
	

}
