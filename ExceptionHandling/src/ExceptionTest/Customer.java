package ExceptionTest;

public class Customer {
	private String custNo;
	private String custName;
	private String category;
	public Customer(String custNo,String custName,String category)throws InvalidInputException
	{
		this.custNo=custNo;
		this.custName=custName;
		this.category=category;
		if(custNo.charAt(0)!='c' && custNo.charAt(0)!='C')
			throw new InvalidInputException("Customer number must start with 'C' or 'c'");
			else if(custName.length()<4)
				throw new InvalidInputException("Customer Name must be atleast of 4 characters");
			else if(!(category.equals("Gold") || category.equals("Silver")||category.equals("Platinum") ))
				throw new InvalidInputException("Category must be either Platinum, Gold or Silver");
	}
	public String getCustNo() {
		return custNo;
	}
	public String getCustName() {
		return custName;
	}
	public String getCategory() {
		return category;
	}
	


}
