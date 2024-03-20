import java.io.*;
import java.util.*;
public class PascalTriangle 
{   
   public static void main(String[] args) {
        int n,i,j,k,num;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter n value : ");
	n = s.nextInt();
	for(i=0;i<n;i++) {
		for(j=n;j>i;j--) {
			System.out.print(" ");
		}
		num = 1;
		for(k=0;k<=i;k++) {
			System.out.print(" "+num);
			num = num * (i - k) / (k + 1);
		}
                System.out.println();
	}
     }
}