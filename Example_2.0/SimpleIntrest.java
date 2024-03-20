import java.util.*;
public class SimpleIntrest 
{
	public static void main(String[] args) 
	{
			Scanner s = new Scanner(System.in);
			float SI,P,T,R;
			System.out.println("Enter Profit value : ");
			P=s.nextInt();
			System.out.println("Enter Time period : ");
			T=s.nextInt();
			System.out.println("Enter Rate of intrest : ");
			R=s.nextInt();
			SI=(P*T*R)/100;
			System.out.println("simple intrest is : "+SI);
	}
}	