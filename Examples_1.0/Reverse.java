import java.util.*;
import java.io.*;
public class Reverse
{
   public static void main(String[] args)
   {
      int n, r=0,sum=0;
      System.out.println("Enter n value : ");
      Scanner s = new Scanner(System.in);
      n = s.nextInt();
      while( n != 0 )
      {
          r = n % 10;
	  sum = sum * 10  + r;
          n = n / 10;
      }
      System.out.println("Reverse of the number is: "+sum);
   }
}