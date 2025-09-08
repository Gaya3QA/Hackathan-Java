//Q8
package Hackathon;

import java.util.Scanner;
import java.util.Arrays;

public class Q8StringtoLower{
	
	void StringtoLower(String t) {
		System.out.println(t.toLowerCase());
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a text to convert it to lower case: ");
		String txt = input.next();
		Q8StringtoLower ob = new Q8StringtoLower();
		ob.StringtoLower(txt);
	}
	}