import java.util.*;
import java.io.*;
public class swapDivisionWithoutTemp
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a,b values: ");
		a = s.nextInt();
		b = s.nextInt();
		System.out.println("Before swapping a = "+a+" b = "+b);
		swapping(a,b);
}
public static void swapping(int a,int b)
{
 	a=a*b;
	b=a/b;
	a=a/b;
	System.out.println("After swapping a = "+a+" b = "+b);
}
}