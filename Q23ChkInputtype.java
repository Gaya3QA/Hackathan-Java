//Q23
package Hackathon;
import java.util.Scanner;
public class Q23ChkInputtype{
	void chkinputtype(String t) {			    
		if(t.matches("\\d*")) {
			System.out.println("Input is a number");
		}
		
		else if(t.toLowerCase().equals("true")) {
			System.out.println("Input is a Boolean");
		}
		else if(t.toLowerCase().equals("false"))
		{
			System.out.println("Input is a Boolean");
		}
		else if(t.matches("[a-z A-Z]*")) {
			System.out.println("Input is a String");
		}
		

}		  		 	  
public static void main(String[] args) {
	    Q23ChkInputtype ob = new Q23ChkInputtype();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number/text/boolean: ");
		String txt = sc.nextLine() ;		
		ob.chkinputtype(txt);
			
	}
	  
}