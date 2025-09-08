//Q14
package Hackathon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Q14Wordrev{
	void rev(String txt) {
		String[] str = txt.split(" ");
		System.out.println("Reverse of the given string:\n");	
		for(int i=str.length-1; i>=0;i--) {
			System.out.print(str[i]+ " ");	
		}														
	}
	public static void main(String[] args) {
		Q14Wordrev ob = new Q14Wordrev();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String txt = sc.nextLine();
		ob.rev(txt);
			
	}
}