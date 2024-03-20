import java.io.*;
import java.util.*;
public class RhombusPyramid 
{
    public static void main(String[] args) 
     {
       Scanner s = new Scanner(System.in);
        int i,j,n,k=0;
	System.out.println("Enter n values : ");
	n = s.nextInt();
	k=n-1;
        for(i=1;i<=n;i++) {
           for(j=1;j<=k;j++) 
           System.out.print(" ");
           k--;
           for(j=1;j<=2*i-1;j++) 
           System.out.print("*");   
	   System.out.println();
        }
        k=1;
	for(i=1;i<=n-1;i++) {
           for(j=1;j<=k;j++) 
           System.out.print(" ");
           k++;
           for(j=1;j<=2*(n-i)-1;j++) 
           System.out.print("*");   
	   System.out.println();
        }
     }
}