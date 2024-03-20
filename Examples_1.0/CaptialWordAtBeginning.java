import java.util.*;
import java.lang.String;

public class CaptialWordAtBeginning 
{
  public static void main(String[] args) 
    {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String line=s.nextLine();
	
        /*System.out.println("Given string is : "+k);
	
        System.out.println("Given string is : "+k.substring(0,1).toUpperCase()+k.substring(1));
        */

        String uppercase = "";
	Scanner sc = new Scanner(line);
	while(sc.hasNext()) 
        {
		String word=sc.next();
		uppercase += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
	System.out.println(uppercase.trim());
     }
}




