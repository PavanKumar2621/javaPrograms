import java.util.*;
public class sevenSegmentDisplay {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		switch(n)  
		{  
		      case 0:  
		        System.out.println(" _ \n| | \n|_|");  
		        break;  
		      case 1:  
		        System.out.println("   \n  |\n  |");  
		        break;  
		      case 2:  
		        System.out.println(" _ \n _|\n|_ ");  
		        break;  
		      case 3:  
		        System.out.println(" _ \n _|\n _|");  
		        break;  
		      case 4:  
		        System.out.println("   \n|_|\n  |");  
		        break;  
		      case 5:  
		        System.out.println(" _ \n|_ \n _|");  
		        break;  
		      case 6:  
		        System.out.println(" _ \n|_ \n|_|");  
		        break;  
		      case 7:  
		        System.out.println(" _ \n  |\n  |");  
		        break;  
		      case 8:  
		        System.out.println(" _ \n|_|\n|_|");  
		        break;  
		      case 9:  
		        System.out.println(" _ \n|_|\n _|");  
		        break;  
		}
	} 
}