//Q4
package Hackathon;

import java.util.Scanner;
import java.util.Arrays;

public class Q4ArrayPalindrome{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = input.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the numbers to check for palindrome: ");
		for(int i=0; i<=size-1; i++) {
			arr[i] = input.nextInt();			
		}
		int reminder =0;
		
		for(int i=0; i<arr.length;i++) {
			int num = arr[i];
			int rev = 0;
			while(num>0) {
				reminder = num%10;
				rev = (rev*10) + reminder;
				num = num/10;
			}		
			if(arr[i] != rev) {
				System.out.println(arr[i] + " is not a Palindrome.");
			}
			else {
			System.out.println(arr[i] + " is a Palindrome.");
			}
		}
	}
}
