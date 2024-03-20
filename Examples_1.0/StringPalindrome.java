import java.util.*;
import java.io.*;
public class StringPalindrome  {
   
    public static void main(String[] args)  {
       
         Scanner s=new Scanner(System.in);
         
         System.out.println("Enter a String : ");
     
	 String a=s.next();
 
         String original = a;

         String rev = "";    //for resultant reversed string

         int n=a.length();    //to find the length of string
 
         for(int i=n-1;i>=0;i--) 
          {
              rev += a.charAt(i);
          } 

          if(original.equals(rev)) 
          { 
               System.out.println("The String "+rev+" is a Palindrome");  
          }
          else 
          { 
               System.out.println("The String "+rev+" is not a Palindrome");  
          }

            
       }

}