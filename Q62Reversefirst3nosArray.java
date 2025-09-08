//Q62  write an algorithm to reverse first 3 numbers, then next 3 numbers, then next 3 numbers, 
//the number will be  based on var k. Array = [3,2,4,7,0,3,1,5,8, 4] k=3 OutPut = [4,2,3,3,0,7,8,5,1,4]
package Hackathon;
import java.util.ArrayList;
import java.util.Scanner;

public class Q62Reversefirst3nosArray {
	
	public static void main(String[] args) {
		int[] arr1 = {3,2,4,7,0,3,1,5,8, 4};
		Scanner sc = new Scanner(System.in);		
		ArrayList<Integer> al = new ArrayList<Integer>();		
		int k = sc.nextInt();
		int[] arr2= new int[k];				
			for(int i=0; i<=k-1;i++) { 
				   arr2[i] = arr1[i];					   
				}
			for(int j=arr2.length-1;j>=0;j--) {
					al.add(arr2[j]);
				}
			for(int l=k;l<=arr1.length-1;l++){
				al.add(arr1[l]);
				
		}
	System.out.println(al.toString());
	}
	
}