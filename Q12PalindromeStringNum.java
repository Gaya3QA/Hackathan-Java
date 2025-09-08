//Q12
package Hackathon;
import java.util.Scanner;
public class Q12PalindromeStringNum {
	void palstringchk(String txt) {
		String rev = "";		
		for(int i=txt.length()-1;i>=0;i--) {
			rev = rev+txt.charAt(i);			
		}
		System.out.println(rev);
		if(txt.equals(rev)) {
		    System.out.println(txt+" is a Palindrome.");
	}
		else {
			System.out.println(txt+" is not a Palindrome.");
		}
	}
	void palnumchk(int n) {
		int num1 = n;
		int reminder =0;
		int rev = 0;		
		while(n>0) {
		   reminder = n%10;
		   rev =(rev*10)+reminder;
		   n=n/10;
		}	
		if(num1 == rev) {
			System.out.println(num1+" is a Palindrome.");
		}
		else {
			System.out.println(num1+" is not a Palindrome.");
		}		
	}	
	public static void main(String[] args) {
		Q12PalindromeStringNum ob = new Q12PalindromeStringNum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a text for Palindrome check: ");
		String txt = sc.next();
		ob.palstringchk(txt);
		System.out.println("Enter a number for Palindrome check: ");
		int num = sc.nextInt();				
		ob.palnumchk(num);		
	}
}
	