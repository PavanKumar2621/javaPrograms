// Sum of digits of cubes of a number is equals to same number is called as "ARMSTRONG NUMBER".
// 371 = 3^3 + 7^3 + 1^3 = 371

package Package;
import java.util.*;
import java.io.*;
public class Armstrong {
	public static void main(String[] args) {
	int n,t,sum=0,r;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter n value: ");
	n=s.nextInt();
	t=n;
	while(n!=0) {
		r=n%10;
		sum=sum+(r*r*r);
		n=n/10;
	}
	if(t==sum) { System.out.println("Armstrong"); }
	else { System.out.println("not Armstrong"); }
}
}