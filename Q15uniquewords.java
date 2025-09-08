//Q15
package Hackathon;
import java.util.HashSet;
import java.util.Scanner;
public class Q15uniquewords{
	void uniqueword(String txt) {
		String[] str = txt.toLowerCase().split(" ");		
		HashSet<String> hs = new HashSet<String>();
		for(String s : str) {
			hs.add(s);
		}
		System.out.println(hs.toString());												
	}
	public static void main(String[] args) {
		Q15uniquewords ob = new Q15uniquewords();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String txt = sc.nextLine();
		ob.uniqueword(txt);
			
	}
}