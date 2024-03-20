import java.util.*;
import java.io.*;
public class Factorial 
{
   public static void main(String[] args) 
     { 
	int n,k;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number : ");
	n = s.nextInt();
	System.out.println("The given number is : "+n);
	k = fact(n);
	System.out.println("The Factorial of the given number is "+k);
}
public static int fact(int n) 
{
  int i,f=1;
  if(n==0 || n==1)
  return 1;
  else
  for(i=1;i<=n;i++) 
  {
    f=f*i;
  }
  return f;
}
}