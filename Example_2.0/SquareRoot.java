import java.util.*;
public class SquareRoot 
{
	public static void main(String[] args) 
	{
			Scanner s = new Scanner(System.in);
			double n,result;
			System.out.println("Enter a number : ");
			n = s.nextDouble();
			result = Math.sqrt(n);
			System.out.println("Square root of "+n+" is : "+result);
	}
}	