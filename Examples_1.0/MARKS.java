import java.util.*;
import java.io.*;
public class MARKS {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter marks : ");
		int marks=s.nextInt();
		if(marks >= 35 && marks <= 45) {
			System.out.println("Grade C = " +marks);
			
		} 
		else if(marks <= 50 && marks >=75) {
			System.out.println("Grade B = " +marks);
		} 
		else {
    			System.out.println("Distinction = " +marks);
 		}
}
}