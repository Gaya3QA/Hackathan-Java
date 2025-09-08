//Q16
package Hackathon;
import java.util.HashSet;
import java.util.Scanner;
public class Q16Removechar{
	public StringBuffer remchar(String txt, String c) {
		StringBuffer s = new StringBuffer(txt);
		int index = txt.indexOf(c);
		s.deleteCharAt(index);
		return s;
	}
	public static void main(String[] args) {
		Q16Removechar ob = new Q16Removechar();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String txt = sc.nextLine();
		System.out.println("Enter a char to remove from the string: ");
		String c = sc.next();
		System.out.println("Text after removing a char: "+ob.remchar(txt, c));
			
	}
}