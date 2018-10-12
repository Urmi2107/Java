package codes;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {

        int num , rev = 0, rem, n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=s.nextInt();
        n = num;

        // reversed integer is stored in variable 
        while( num != 0 )
        {
            rem= num % 10;
            rev = rev * 10 + rem;
            num  /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (n == rev)
            System.out.println("True");
        else
            System.out.println("False");
        s.close();
    }

}
