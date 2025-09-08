//Q24 Write a program which inputs a positive natural number N and prints the possible consecutive number combinations, which when added give N.   
//INPUT: N = 9  OUTPUT: 4 + 5     2 + 3+ 4

package Hackathon;
import java.util.Scanner;
public class Q24Sumconsecutive{
	void sum(int n) {	
		
		for(int i=1;i<=n/2;i++) {
			int sum=0;
			int x=i;
			String s = "";
			while(sum<n) {
				sum = sum+x;
				s=s+x+ "+";
				x++;				
			}
			if(sum==n) {
				System.out.println(s.substring(0,s.length()-1));
			}
		}
	    	
	}    		  		 	  
public static void main(String[] args) {
	Q24Sumconsecutive ob = new Q24Sumconsecutive();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();		
		ob.sum(num);
			
	}
	  
}
