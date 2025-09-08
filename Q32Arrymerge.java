//Q32
package Hackathon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Q32Arrymerge{
	void merge(int a[], int b[]) {	
		Arrays.sort(a);
		Arrays.sort(b);
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<=a.length-1;i++) {
			al.add(a[i]);		
		}
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		for(int i=0;i<=b.length-1;i++) {
			al1.add(b[i]);		
		}
		al.addAll(al1);
		Collections.sort(al);
		System.out.println("After merging: "+al);
		
		}		
	  		 	  
public static void main(String[] args) {
	Q32Arrymerge ob = new Q32Arrymerge();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size for Array a: ");
		int size = sc.nextInt();
		System.out.println("Enter elements for Array a: ");
		int[] a = new int[size];
		for(int i=0;i<=size-1;i++) {
			a[i] =sc.nextInt();
		}
		System.out.println("Enter the size for Array b: ");
		int size1 = sc.nextInt();
		System.out.println("Enter elements for Array b: ");
		int[] b = new int[size1];
		for(int i=0;i<=size1-1;i++) {
			b[i] =sc.nextInt();
		}
		
		ob.merge(a , b);
			
	}
	  
}