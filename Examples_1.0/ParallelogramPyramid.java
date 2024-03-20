import java.io.*;
import java.util.*;
public class ParallelogramPyramid 
{
    public static void main(String[] args) 
     {
       Scanner s = new Scanner(System.in);
        int i,j,r,n;
	System.out.println("Enter r values : ");
	r = s.nextInt();
        System.out.println("Enter n values : ");
	n = s.nextInt();
	
        for(i=0;i<r;i++) {
	   for(j=0;j<r-i-1;j++) {
              System.out.print(" ");
           }
           for(j=0;j<n;j++) {
              if((i==0||i==r-1)||(j==0||j==n-1))
	      System.out.print("*");
	      else
              System.out.print(" ");
           }
           System.out.println();
        }
     }
}