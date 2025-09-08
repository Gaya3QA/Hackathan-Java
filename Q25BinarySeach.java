package Hackathon;
import java.util.Arrays;
import java.util.Scanner;
public class Q25BinarySeach{
	public static void binarySearch(int arr[], int first, int last, int key) {
		Arrays.sort(arr);
		System.out.println("Sorted Array: ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		int mid = (first + last) / 2;
		while (first <= last) {
			if (key > arr[mid]) {
				first = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("Element is found at index: " + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element is not found!");
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter 5 elements of an Array: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter an element to find: ");
		int key = sc.nextInt();
		int last = arr.length - 1;
		binarySearch(arr, 0, last, key);
	}
}