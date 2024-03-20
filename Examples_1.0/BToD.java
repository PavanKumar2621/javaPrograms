import java.util.*;
import java.io.*;
import java.lang.*;
public class BToD 
{ 
  public static void main(String[] args) 
   {
     Scanner s = new Scanner(System.in);
     System.out.println("Enter bunary value : ");
     String b = s.nextLine();
     int d = Integer.parseInt(b,2);
     System.out.println("Decimal form of "+b+" is " +d);
    }
}