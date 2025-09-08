//Q9
package Hackathon;

import java.util.Scanner;
import java.util.Arrays;

public class Q9StringtoUpper {
	
	void StringtoUpper(String t) {
		System.out.println(t.toUpperCase());
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a text to convert it to upper case: ");
		String txt = input.next();
		Q9StringtoUpper ob = new Q9StringtoUpper();
		ob.StringtoUpper(txt);
	}
	}