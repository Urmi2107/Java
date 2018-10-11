package ExceptionExamples;

public class TaxCalculator {
	public double calculateTax(String empName,boolean isIndian,double empSal)throws CountryNotValidException,EmployeeNameInvalidException,TaxNotEligibleException
	{
		double taxAmount=0.0;
		
			if(isIndian==false)
				throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
			else if(empName.equals(""))
				throw new EmployeeNameInvalidException("The employee name cannot be empty");
			else
				{
					if(empSal>100000 && isIndian==true)
						taxAmount=empSal *8/100 ;
					else if(empSal<=100000 && empSal>50000 && isIndian==true )
						taxAmount=empSal *6/100;
					else if(empSal<=50000 && empSal>30000 && isIndian==true)
						taxAmount=empSal *5/100;
					else if(empSal<=30000 && empSal>10000 && isIndian==true)
						taxAmount=empSal *4/100;
					else
						throw new TaxNotEligibleException("The employee does not need to pay tax");
				}
			
		
		return taxAmount;
	}

}
