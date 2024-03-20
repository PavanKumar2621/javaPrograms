import java.io.*;
import java.util.*;
public class RevSplLeftTri 
{
    public static void main(String[] args) 
     {
       Scanner s = new Scanner(System.in);
        int i,j,n,k;
	System.out.println("Enter n values : ");
	n = s.nextInt();
	for(i=0;i<n;i++) {
	   for(j=i;j<n;j++) {
	       System.out.print(" ");
           }
           for(k=0;k<=i;k++) {
               System.out.print("*");
           }
           System.out.println();
        }
        for(i=0;i<n-1;i++) {
	   for(j=0;j<=i+1;j++) {
	       System.out.print(" ");
           }
           for(k=n-1;k>i;k--) {
               System.out.print("*");
           }
           System.out.println();
        }
     }
}