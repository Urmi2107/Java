package FirstDay;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AdditionTest {
		
	   int n1=55;
	   int n2=10;
	   
	   Addition a = new Addition();

	   @Test
	   public void testAddition() {
	     
		   assertEquals(65,a.add(n1,n2));
		  
	   }
	

}
