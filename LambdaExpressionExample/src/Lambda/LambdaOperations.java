package Lambda;
interface Odd
{
	public boolean isOdd(int n);
}
interface Prime
{
	public boolean isPrime(int n);
}
interface Palindrome
{
	public boolean isPalindrome(int n);
}
public class LambdaOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Odd o=(n)->{if(n%2==0) 
					return false ;
				else 
					return true;
		};
		System.out.println("For odd, result is="+o.isOdd(55));
		
		Prime p=(n)->{int flag=0;
			for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			return false;
		else
			return true;

		};
		System.out.println("For Primne, result is="+p.isPrime(55));
		Palindrome pr=(n)->{ int rev=0,num=0;
		num=n;
		while(num>0)
		{
			rev=rev*10+num%10;
			num/=10;
		}
		if(rev==n)
			return true;
		else
			return false;
		
		};
		System.out.println("For Palindrome, result is="+pr.isPalindrome(55));
		
		

	}

}
