import java.util.*;
import java.io.*;
public class RevRightangTriStr
{ 
    public static void main(String[] args) 
      {
         Scanner s = new Scanner(System.in);
	 int n,i,j,k;
	 System.out.println("Enter n value : ");
	 n = s.nextInt();
	 for(i=1;i<=n;i++) {
	     for(j=n-1;j>=i;j--) {
		System.out.print(" ");
	     } 
	     for(k=1;k<=i;k++) {
		  System.out.print("*");
             }
		System.out.println();
	 }
      }
}