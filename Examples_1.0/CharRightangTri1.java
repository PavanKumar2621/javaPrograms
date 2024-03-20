import java.util.*;
import java.io.*;
public class CharRightangTri1
{ 
    public static void main(String[] args) 
      {
         Scanner s = new Scanner(System.in);
	 int n,i,j,k;
	 System.out.println("Enter n value : ");
	 n = s.nextInt();
	 for(i=1;i<=n;i++) {
	     for(j=1;j<=i;j++) {
		System.out.print(" "+(char)(i+64));
	     }
	     System.out.println();
	 }
      }
}