//Q22
package Hackathon;
import java.util.Scanner;
public class Q22InttoString{
	void InttoString(int n) {
		String txt;
		System.out.println("Before converting to String: "+(n+10));
		txt = String.valueOf(n);
		System.out.println("After converting to String: "+(txt+10));

}		  		 	  
public static void main(String[] args) {
	    Q22InttoString ob = new Q22InttoString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();		
		ob.InttoString(num);
			
	}
	  
}