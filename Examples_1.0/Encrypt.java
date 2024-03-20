import java.util.*;
public class Encrypt {
	public static int encrypt(int number) {
	    // Extract each digit of the number
	    int digit1 = number / 1000;
	    int digit2 = (number / 100) % 10;
	    int digit3 = (number / 10) % 10;
	    int digit4 = number % 10;

	    // Replace each digit by ((digit+7) mod 10)
	    digit1 = (digit1 + 7) % 10;
	    digit2 = (digit2 + 7) % 10;
	    digit3 = (digit3 + 7) % 10;
	    digit4 = (digit4 + 7) % 10;

	    // Swap the first and third digit, and the second and fourth digit
	    int encrypted = (digit3 * 1000) + (digit4 * 100) + (digit1 * 10) + digit2;

	    return encrypted;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int number = s.nextInt();
		int encrypted = encrypt(number);
		System.out.println(encrypted); 
	}	
}