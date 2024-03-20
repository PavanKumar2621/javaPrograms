// Sum of factorial of digits of a number equals to number is called as "STRONG NUMBER".
// 145 = 1! + 4! + 5! = 145

import java.util.*;

class StrongNumber 
{
   public static void main(String[] args) 
    {
       Scanner s = new Scanner(System.in);
       int temp,n,r=0,fact,sum=0,i;
       System.out.println("Enter n value: ");
       n = s.nextInt();
       temp=n;
       while(n>0) 
       { 
	 r=n%10;
	 fact=1;
	 for(i=r;i>=1;i--) {   fact =fact*i; }
	 sum+=fact;
	 n=n/10;
       }
	if(temp==sum) { System.out.println("Strong number"); }
	else { System.out.println("not a Strong number"); }
     }
}