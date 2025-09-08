//Q21
package Hackathon;
import java.util.Scanner;
public class Q21StringtoInt{
	void stringtoInt(String t) {
		int num;
		System.out.println("Before converting to Int: "+(t+10));
		num = Integer.parseInt(t);
		System.out.println("After converting to Int: "+ (num+10));

}		  		 	  
public static void main(String[] args) {
	    Q21StringtoInt ob = new Q21StringtoInt();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String txt = sc.nextLine();		
		ob.stringtoInt(txt);
			
	}
	  
}