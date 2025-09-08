//Q2
package Hackathon;

import java.util.Scanner;

public class Q2Factorial{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to find factorial: ");
		int num = input.nextInt();
		int fact =1;
		System.out.println("0! : "+fact);
		for(int i=1;i<=num;i++) {
			fact = fact*i;
			System.out.println(i+"! : "+fact );
		}
		
	}
}
