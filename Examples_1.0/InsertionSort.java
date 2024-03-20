import java.io.*;
import java.util.*;
public class InsertionSort 
{
	public static void bubbleSort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n-1); j++) {
				if (arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
                        }
                }
	}
	public static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; i++)  {
	            System.out.println(arr[i] + " ");
		}
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int p,arr[];
		p = s.nextInt();
		System.out.println("Enter array of elements : ");
		arr = new int[p];
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}  
                bubbleSort(arr);
		System.out.println("After sorting the Array elements are : ");
		printArray(arr);
	}
}

