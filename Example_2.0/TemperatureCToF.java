import java.util.*;

public class TemperatureCToF

{

	public static void main(String[] args)

	{
		Scanner s = new Scanner(System.in);

		float far,cel;
		
		System.out.println("\n Enter temperature in Celcius : ");
		
		cel = s.nextFloat();
 
		far =  (cel  * 9 / 5) + 32;

		System.out.println("Celcius to Faurnheit is : "+far);

	}

}
