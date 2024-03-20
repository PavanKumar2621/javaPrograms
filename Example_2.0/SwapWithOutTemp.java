import java.util.*;
public class SwapWithOutTemp 
{
	public static void main(String[] args) 
	{
			Scanner s = new Scanner(System.in);
			int a,b;
			System.out.println("Enter a value : ");
			a=s.nextInt();
			System.out.println("Enter b value : ");
			b=s.nextInt();
			System.out.println("Before swapping : "+a+" and "+b);
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("After swapping : "+a+" and "+b);
	}
}	