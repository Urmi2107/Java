package pkgCollections;
import java.util.*;
public class BankAccountList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<SavingAccount> set=new TreeSet<SavingAccount>();  
		SavingAccount a1=new SavingAccount(6000.12,700,"Urmi",true);
		SavingAccount a2=new SavingAccount(7000.12,701,"Juin",true);
		SavingAccount a3=new SavingAccount(7000.12,701,"Juin",true);
		
		set.add(a1);
		set.add(a2);
		set.add(a3);
		a1.deposit(400);
		a2.withdraw(500);
		Iterator<SavingAccount> itr=set.iterator();
		while(itr.hasNext())
		{
			SavingAccount s=(SavingAccount)itr.next();
			System.out.println("Account Balance:"+s.getAcc_balance()+" Account Id:"+s.getAcc_ID()+" Account Holder Name:"+s.getAccountHoldername()+" Salary Account:"+s.isSalaryAccount());
			
		}
		
		
	}

}
