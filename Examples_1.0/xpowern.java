import java.util.*;

class xpowern
{
    public static void main(String[] args) 
    {   
        int p=1;
        Scanner s = new Scanner(System.in);
	System.out.println("Enter x value: ");
	int x=s.nextInt();
	System.out.println("Enter power value: ");
	int n=s.nextInt();
	for(int i=1;i<=n;i++) { p=p*x; }
	System.out.println(+x+" power "+n+" is : "+p);
	
	
     }
}