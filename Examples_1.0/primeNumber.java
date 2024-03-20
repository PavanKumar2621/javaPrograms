import java.io.*;
import java.util.*;
public class primeNumber {	
	public static void main(String[] args)  {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		int flag=0;
		for(int i=2;i<=n-1;i++)
		{
		    if(n%i==0)
		        {
			   flag++;
			}
		}  
		if(flag==0)
		{
		   System.out.println("The given "+n+" is a prime number ");
		}
		else
		{
		   System.out.println("The given "+n+" is not a prime number ");
		} 


	}
}