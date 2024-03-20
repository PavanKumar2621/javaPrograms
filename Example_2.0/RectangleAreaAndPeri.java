import java.util.*;

public class RectangleAreaAndPeri

{

	public static void main(String[] args)

	{
		Scanner s = new Scanner(System.in);
		
		int length,breadth,area,perimeter;
	
		System.out.println("Enter length of the rectangle : ");

		length = s.nextInt();
		
		System.out.println("Enter breadth of the rectangle : ");
 	
		breadth = s.nextInt();

		area = length * breadth;
	
 		perimeter = 2 * (length + breadth);

		System.out.println("Area : "+area);

		System.out.println("perimeter : "+perimeter);

	}

}
