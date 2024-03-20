import java.util.*;

public class TemperatureFToC

{

	public static void main(String[] args)

	{
		Scanner s = new Scanner(System.in);

		float far,cel;
		
		System.out.println("Enter temperature in Faurnheit : ");
		
		far = s.nextFloat();
 
		cel =  ((far - 32) * 5) / 9;

		System.out.println("Faurnheit to Celcius is : "+cel);

	}

}
