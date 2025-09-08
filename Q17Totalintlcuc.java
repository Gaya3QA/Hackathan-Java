//Q17
package Hackathon;
import java.util.ArrayList;
import java.util.Scanner;
public class Q17Totalintlcuc{
	  void total(String txt) {
		 		 
		 int countint=0;
		 int countupper  =0;
		 int countlower = 0;
		 
		 for(int i=0;i<=txt.length()-1;i++) {
			
		 if(Character.isLowerCase(txt.charAt(i))) {
				 countlower++;
				 }
			 if(Character.isUpperCase(txt.charAt(i))) {
				 countupper++;
			 }
			 if(Character.isDigit(txt.charAt(i))) {
				 countint++;
			 }
		 }
			 System.out.println("Total no of digit in the given string :" +countint);
			 System.out.println("Total no of Upper case in the given string :" +countupper);
			 System.out.println("Total no of Lower case in the given string :" +countlower);
		 
	}
	public static void main(String[] args) {
		Q17Totalintlcuc ob = new Q17Totalintlcuc();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String txt = sc.nextLine();		
		ob.total(txt);
			
	}
}