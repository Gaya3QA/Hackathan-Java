//Q34
package Hackathon;
import java.util.Scanner;
public class Q34operationsusing{
	void ops(int a, int b) {			    
		//subtraction
		int subtraction=0;
		subtraction = a + (-b);
		System.out.println("subtraction: " +subtraction);
		int prod=0;
		for (int i=1;i<=b;i++) {
			prod =  prod +a;
		}
		System.out.println("Multiplication: " +prod);
		int div=a;
		int count=0;
		while(div>=b) {
			div = div +(-b);
			count++;
		}
		System.out.println("Division: " +count);
		
		}
		

	  		 	  
public static void main(String[] args) {
	Q34operationsusing ob = new Q34operationsusing();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b: ");
		int a = sc.nextInt();
		int b = sc.nextInt() ;
		ob.ops(a , b);
			
	}
	  
}