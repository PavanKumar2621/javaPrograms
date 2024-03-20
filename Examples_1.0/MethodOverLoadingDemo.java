import java.io.*;
import java.util.*;
public class MethodOverLoadingDemo 
{ 
   public static void main(String[] args) 
     {
        Scanner s = new Scanner(System.in);
        int a,b;
        float c,d;
        double e,f;
	System.out.println("Enter a,b,c,d,e,f values : ");
        a=s.nextInt();
	b=s.nextInt();
	c=s.nextFloat();
	d=s.nextFloat();
	e=s.nextDouble();
	f=s.nextDouble();
        MethodOverLoadingDemo m = new MethodOverLoadingDemo();
	m.add(a,b);
        m.add(c,d);
	m.add(b,d);
	m.add(c,e,f); 
      }
	void add(int a,int b) {
             System.out.println("Sum = "+(a+b));
 	}
        void add(int a,float b) {
             System.out.println("Sum = "+(a+b));
 	}
        void add(float a,float b) {
             System.out.println("Sum = "+(a+b));
 	}
	void add(float a,double b,double c) {
             System.out.println("Sum = "+(a+b+c));
 	}
}