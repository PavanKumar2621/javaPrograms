import java.util.*;
import java.io.*;
public class Palindrome
{
   public static void main(String[] args)
   {
      int n, r=0,sum=0,m;
      System.out.println("Enter n value : ");
      Scanner s = new Scanner(System.in);
      n = s.nextInt();
      m = n;
      while( n != 0 )
      {
          r = n % 10;
	  sum = sum * 10  + r;
          n = n / 10;
      }
	if(sum == m)
        {
		System.out.println("Given number is Palindrome : "+sum);
	}
	else
	{
		System.out.println("Given number is not a Palindrome : "+sum);
	}
    }
}
