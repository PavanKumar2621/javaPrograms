import java.util.*;
import java.io.*;
public class Pyramid
{ 
    public static void main(String[] args) 
      {
         Scanner s = new Scanner(System.in);
	 int n,i,j,k;
	 System.out.println("Enter n value : ");
	 n = s.nextInt();
	 for(i=0;i<n;i++) {
             for(j=n;j>i;j--) {
		System.out.print(" ");
             }
	     for(k=0;k<=i;k++) {
		System.out.print("* ");
	       
	     }
	     System.out.println();
	 }
      }
}