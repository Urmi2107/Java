package pkgCollections;

public class SavingAccount implements Comparable<SavingAccount>
{
	private double acc_balance;
	private int acc_ID;
	private String accountHoldername;
	private boolean isSalaryAccount;
	public SavingAccount(double acc_balance,int acc_ID,String accountHoldername,boolean isSalaryAccount)
	{
		this.acc_balance=acc_balance;
		this.acc_ID=acc_ID;
		this.accountHoldername=accountHoldername;
		this.isSalaryAccount=isSalaryAccount;
	}
	
	public double getAcc_balance() {
		return acc_balance;
	}

	public void setAcc_balance(int acc_balance) {
		this.acc_balance = acc_balance;
	}

	public int getAcc_ID() {
		return acc_ID;
	}

	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}

	public String getAccountHoldername() {
		return accountHoldername;
	}

	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	public void withdraw(double amt)
	{
		acc_balance-=amt;
	}
	public void deposit(double amt)
	{
		acc_balance+=amt;
	}
	@Override
	public int compareTo(SavingAccount o) {
		// TODO Auto-generated method stub
		if(acc_ID>o.acc_ID){  
	        return 1;  
	    }else if(acc_ID<o.acc_ID){  
	        return -1;  
	    }else{  
	    return 0;  
	    }  
		
	}
	
}
