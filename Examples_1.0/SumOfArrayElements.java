import java.io.*;
import java.util.*;
public class SumOfArrayElements 
{
   public static void main(String[] args)
     {
         Scanner s=new Scanner(System.in);
         int a[],i,sum=0;
         System.out.println("Enter n value : ");
         int n=s.nextInt();
         a=new int[n];
         System.out.println("Enter matrix elements : ");
	 for(i=0;i<n;i++)
          {
	        a[i]= s.nextInt();
	  } 
     //Addition of all elements..
 	 for(i=0;i<n;i++) 
          {
		sum += a[i];
	  }
         System.out.println("The Sum of the matrix elements are : "+sum);
      }
}							