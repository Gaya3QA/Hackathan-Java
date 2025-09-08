//Q5
package Hackathon;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Q5ArrayUniqueDupcount{
	void uniqueno(int arr[]){
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<=arr.length-1;i++) {
			hs.add(arr[i]);			
		}
		System.out.println("Unique numbers:"+hs);
	}
   void duplicate(int arr[]) {
	   Map<Integer,Integer> hm = new HashMap<Integer, Integer>();
	   for(int num : arr) {
		   if(!hm.containsKey(num)) {
			   hm.put(num,1);
		   }
		   else {
			   hm.put(num, hm.get(num)+1);
		   }
		   
	   }
	  System.out.println("Duplicate numbers:"+hm);
   }
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = input.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the numbers to fine unique and count fo duplicate: ");
		for(int i=0; i<=size-1; i++) {
			arr[i] = input.nextInt();			
		}
		Q5ArrayUniqueDupcount ob = new Q5ArrayUniqueDupcount();
		ob.uniqueno(arr);
		ob.duplicate(arr);
	
	}
}