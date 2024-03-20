import java.util.*;
import java.io.*;
public class CountNumberOfDigits
{
	public static void main(String[] args)
	{
		int n, temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value : ");
		n = s.nextInt();
		while(n>0) 
		{
		     n=n/10;
		     temp++;
		}
		System.out.println("Number of Digits in a number : "+temp);
	}
}