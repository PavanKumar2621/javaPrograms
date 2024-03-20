import java.io.*;
import java.util.*;
public class Rhombus1Pyramid 
{
    public static void main(String[] args) 
     {
       Scanner s = new Scanner(System.in);
        int i,j,n,k=0;
	System.out.println("Enter n values : ");
	n = s.nextInt();
	k=n-1;
        for(i=0;i<n;i++) {
	   for(j=0;j<n-i-1;j++) {
              System.out.print(" ");
           }
           for(j=0;j<n;j++) {
              if((i==0||i==n-1)||(j==0||j==n-1))
	      System.out.print("*");
	      else
              System.out.print(" ");
           }
           System.out.println();
        }
     }
}