package FirstDay;
public class Digit 
{
    public  int  sum(int n)
    {
        int r,  sum = 0;
        
        while(n > 0)
        {
            r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        System.out.println("Sum of Digits:"+sum);
        return sum;
    }
}