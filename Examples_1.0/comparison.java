import java.util.*;
import java.io.*;
public class comparison {
	public static void main(String[] args) {
	int x,y,z;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter x,y,z values: ");
	x = s.nextInt(); 
	y = s.nextInt(); 
	z = s.nextInt(); 
if (x == z) {
	System.out.println("x and z are equal");
}
if (x > z) {
	System.out.println("x is greater than z");
} else {
	System.out.println("x is not greater than z");
}
if (x != y) {
	System.out.println("x and y are not equal");
}
if (x <= z) {
	System.out.println("x is less than or equal to z");
} else {
	System.out.println("x is not less than or equal to z");
}
}
}