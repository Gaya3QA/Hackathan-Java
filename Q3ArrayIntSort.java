//Q3
package Hackathon;

import java.util.Scanner;
import java.util.Arrays;

public class Q3ArrayIntSort{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int size = input.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the numbers: ");
		for(int i=0;i<=size-1;i++) {
			 arr[i]  = input.nextInt();
		}
		System.out.println("Before sort: "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After sort: "+Arrays.toString(arr));
				
	}
}