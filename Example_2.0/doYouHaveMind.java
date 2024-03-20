import java.util.*;
public class doYouHaveMind 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("CHOOSE A NUMBER FROM 1-10");
		int n = s.nextInt();
		int r=0;
		if(n>0 && n<=10) 
		{
			System.out.println("DOUBLE THE NUMBER\nADD 8\nDIVIDE THAT BY 2\nAND SUBTRACT YOUR ORIGINAL NUMBER\n");
			System.out.println("Take the corresponding letter in the alphabet");
			System.out.println("1=A 2=B 3=C 4=D 5=E 6=F\n7=G 8=H 9=I 10=J 11=K 12=L\n");
			System.out.println("Choose a COUNTRY that start with your letter\n");
			System.out.println("Take the next letter in the alphabet");
			System.out.println("1=A 2=B 3=C 4=D 5=E 6=F\n7=G 8=H 9=I 10=J 11=k 12=l\n");

			System.out.println("Choose an ANIMAL that start with your letter\n");
			System.out.println("Choose which COLOR your animal is\n");

			r=((n*2)+8)/2-n;
			System.out.println("Oh..!! great \nyou choosen a GREY ELEPHANT from DENMARK");
			
			
		}
		else 
		{
			System.out.println("Invalid choice..!!");
		}

	}
}