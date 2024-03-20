import java.util.*;
import java.io.*;
public class ExceptionDemo 
{
    public static void main(String[] args)
      {
         int a,b;
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter a,b values : ");
          a = s.nextInt();
	  b = s.nextInt();
         try {
              System.out.println("Division :  "+(a/b));
             }
         catch(ArithmeticException e) {
	        System.out.println("Division by Zero Error");
	        System.out.println("Enter a non zero integer value: "); 
	     }
          System.out.println("Addition : "+(a+b));
      }
}