import java.io.*;
import java.util.*;
public class MatrixSum
{
   public static void main(String[] args) {
    
	int a[][],b[][],c[][];
	int i,j;
        a=new int[3][3];
	b=new int[3][3];
	c=new int[3][3];
	Scanner s = new Scanner(System.in);
        System.out.println("Enter first matrix: ");
        for(i=0;i<3;i++) {
           for(j=0;j<3;j++) {
               a[i][j] = s.nextInt();
           }
        }
	System.out.println("Enter second matrix: ");
        for(i=0;i<3;i++) {
           for(j=0;j<3;j++) {
               b[i][j] = s.nextInt();
           }
        }
	System.out.println("Addition of matrices is: ");
        for(i=0;i<3;i++) {
           for(j=0;j<3;j++) {
               c[i][j] = a[i][j] + b[i][j];
           }
        } 
	System.out.println("The resultant matrix: ");
        for(i=0;i<3;i++) {
           for(j=0;j<3;j++) {
               System.out.print(" "+c[i][j]);
           }
            System.out.println();
        }
}
}