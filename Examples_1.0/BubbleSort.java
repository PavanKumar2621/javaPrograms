import java.io.*;
import java.util.*;
public class BubbleSort
{
	public static void bubbleSort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
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
		System.out.println("Enter array of elements : ");
		int arr[];
		arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}  
                bubbleSort(arr);
		System.out.println("After sorting the Array elements are : ");
		printArray(arr);
		s.close();
	}
}

