//Q13
package Hackathon;
import java.util.Scanner;
public class Q13Stringrev{
	void palstringchk(String txt) {
		String rev = "";		
		for(int i=txt.length()-1;i>=0;i--) {
			rev = rev+txt.charAt(i);			
		}
		System.out.println("Reverse of the given string:\n" +rev);
		
	}
	public static void main(String[] args) {
		Q13Stringrev ob = new Q13Stringrev();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String txt = sc.nextLine();
		ob.palstringchk(txt);
				
	}
}
	