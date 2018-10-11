package ExceptionExamples;

public class CalculatorSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxCalculator t=new TaxCalculator();
		double tax=0.0;
		try
		{
			tax=t.calculateTax("Ron", false, 34000);
			//if(tax!=0.0)
				System.out.println("Tax amount is "+tax);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		try
		{
			tax=t.calculateTax("Tim", true, 1000);
			//if(tax!=0.0)
				System.out.println("Tax amount is "+tax);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		try
		{
			tax=t.calculateTax("Jack", true, 55000);
			//if(tax!=0.0)
				System.out.println("Tax amount is "+tax);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		try
		{
			tax=t.calculateTax("", true, 30000);
			//if(tax!=0.0)
				System.out.println("Tax amount is "+tax);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		

	}

}
