//Q6
package Hackathon;

import java.util.Scanner;
import java.util.Arrays;

public class Q6ArraysSelectionSort{
	
	void Selectionsort(int arr[]) {
		for(int i=0;i<=arr.length-1;i++) {
			int min_index = i;
			for(int j=i+1;j<arr.length;j++) {
			  
			  if(arr[j] < arr[min_index]) {
				min_index=j;
			  }
			}
				int tmp = arr[min_index];
				arr[min_index] = arr[i];
				arr[i] = tmp;							
		
	}
	System.out.println("Sorted Array: "+Arrays.toString(arr));
	
	}	
	
	public static void main(String[] args) {
		Q6ArraysSelectionSort ss = new Q6ArraysSelectionSort();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = input.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the numbers to sort: ");
		for(int i=0; i<size; i++) {
			arr[i] = input.nextInt();			
		}
		ss.Selectionsort(arr);
		
			
	}						
	}
	