import java.util.*;
import java.io.*;
public class ReversePyramid
{ 
    public static void main(String[] args) 
      {
         Scanner s = new Scanner(System.in);
	 int n,i,j,k;
	 System.out.println("Enter n value : ");
	 n = s.nextInt();
	 for(i=n-1;i>=0;i--) {
             for(j=0;j<n-i;j++) {
		System.out.print(" ");
             }
	     for(k=0;k<=i;k++) {
		System.out.print("* ");
	       
	     }
	     System.out.println();
	 }
      }
}