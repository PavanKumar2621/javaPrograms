import java.io.*;
import java.util.*;
public class LPyramid 
{
    public static void main(String[] args) 
     {
       Scanner s = new Scanner(System.in);
        int i,j,n,k;
	System.out.println("Enter n values : ");
	n = s.nextInt();
	for(i=0;i<n;i++) {
            for(j=i;j<n-1;j++) {
               System.out.print(" ");
           }
           for(k=0;k<=i;k++) {
                System.out.print(" "+(k+1));
           }
            System.out.println();
        }
     }
}