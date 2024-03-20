class A {
     int a,b;
     void add() {
          System.out.println("Addition is " +(a+b));
      }
}
class B extends A {
     int x,y;
     void sub() {
         
          System.out.println("Subtraction is " +(x-y));
      }
}
class c extends A {
     int p,q;
     void mul() {
         
          System.out.println("Multiplication is " +(p*q));
      }
}
public class HierarchicalDemo
{
   public static void main(String[] args) 
     {  
	A ak = new A();
        B b = new B();
        C c = new C();
	ak.a=10; ak.b=20; b.x=20;  b.y=30;
        c.p=23; c.q=35;
        a.add(); 
        b.sub();
	c.mul();
     }
}