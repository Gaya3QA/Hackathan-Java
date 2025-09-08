package Hackathon;

import java.util.Scanner;

public class Q28FactorialRecursion{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no to find factorial: ");
		int num = sc.nextInt();
		int factorial = fact(num);		
		System.out.println("Factorial is : "+factorial);	
	}
	public static int fact(int k) {
		if(k>1) {
			int fact = k * fact(k-1);
	     	return fact;
		}
		else {
			return 1;
		}	
	}
	}
