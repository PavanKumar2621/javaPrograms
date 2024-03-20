import java.io.*;
import java.util.*;
public class LinearSearch
{
   public static void main(String[] args)
     {
	
         Scanner s=new Scanner(System.in);
	 System.out.println("Enter how many number you want: ");
         int n=s.nextInt();
         boolean flag=false;
         int a[] = new int[n];
	 int i;
         System.out.println("Enter array elements:  ");
         for(i=0;i<n;i++)
	 {
	   a[i]=s.nextInt();
	 }
	 System.out.println("Enter the element to be search: ");
         int k=s.nextInt();
	  for(i=0;i<n;i++)
	 {
	   if(k==a[i])
           {
              System.out.println("The Element is found at : "+i);
	      flag=true;
	      break;
	    }
	 }
	 if(flag==false)
           {
              System.out.println("The Element is not found ");
           }
      }
}