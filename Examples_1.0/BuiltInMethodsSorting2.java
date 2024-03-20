//Sorting Array elements Using Bulit-in Methods
import java.io.*;
import java.util.*;
public class BuiltInMethodsSorting2  {
	public static void main(String[] args)  {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = s.nextInt();
		int a[] =new int[n];
		System.out.println("Enter array elements : ");
		for(int i=0;i<n;i++) 
                {
		     a[i] = s.nextInt();
		}
		System.out.println("Array elements before sorting : "+Arrays.toString(a));
		Arrays.sort(a);  //Sort technique
		System.out.println("Array elements After sorting : "+Arrays.toString(a));
	}
}