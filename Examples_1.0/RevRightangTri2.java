import java.util.*;
import java.io.*;
public class RevRightangTri2
{ 
    public static void main(String[] args) 
      {
         Scanner s = new Scanner(System.in);
	 int n,i,j,k;
	 System.out.println("Enter n value : ");
	 n = s.nextInt();
	 for(i=n;i>=1;i--) {
	     for(j=1;j<=i;j++) {
		System.out.print(j);
	     }
	     System.out.println();
	 }
      }
}