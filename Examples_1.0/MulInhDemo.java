class Addition
{
    public void add(int a, int b) {
	System.out.println("Addition is "+(a+b));
	}
}
class Subtraction extends Addition
{
    public void sub(int a, int b) {
	System.out.println("Subtraction is "+(a-b));
	}
}
class Multiplication extends Subtraction 
{
    public void Multiply(int a, int b) {
	System.out.println("Multiplication is "+(a*b));
	}
}
class Division extends Multiplication
{
    public void division(int a, int b) {
	System.out.println("Division is "+(a/b));
	}
	public void CallAllMethodsds() 
	{
		add(3,2); 
		Multiply(4,5); 
		division(4,2);
		sub(4,3);
        }
}
public class MulInhDemo {
     public static void main(String[] args) {
		Division d = new Division();
		d.CallAllMethodsds();
	}
}