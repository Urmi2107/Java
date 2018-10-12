package FirstDay;
import org.junit.Test;
import static org.junit.Assert.*;
public class SmallestTest {
	int a=7;
	int b=13;
	int c=12;
	Smallest s=new Smallest();
	 @Test
	 public void testSmallest()
	{
		 assertEquals(a,s.small(a,b,c));
	}
	

}
