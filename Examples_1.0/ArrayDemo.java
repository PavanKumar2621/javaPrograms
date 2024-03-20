import java.io.*;
import java.util.*;
public class ArrayDemo 
{
   public static void main(String[] args)
     {
         Scanner s=new Scanner(System.in);
         int a[][],i,j;
         a=new int[3][3];
         System.out.println("Enter matrix elements : ");
	 for(i=0;i<3;i++) {
		for(j=0;j<3;j++) {
			a[i][j] = s.nextInt();
			}
	 }
	 System.out.println("The Matrix elements are : ");
 	 for(i=0;i<3;i++) {
		for(j=0;j<3;j++) {
			 System.out.print(" "+a[i][j]);
			}
			System.out.println();
	 }
      }
}							