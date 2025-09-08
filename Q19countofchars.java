//Q19
package Hackathon;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
public class Q19countofchars{
	  void dupchr(String txt) {
		  HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		  for(int i=0;i<=txt.length()-1;i++) {
			  if(!hm.containsKey(txt.charAt(i))) {
				  hm.put(txt.charAt(i), 1);
			  }
			  else {
				  hm.put(txt.charAt(i), hm.get(txt.charAt(i))+1);
			  }
		  }	
		  
	  System.out.println("No. of occuraces of characters are: "+hm);
			  
		  }		  		 	  
	  public static void main(String[] args) {
		  Q19countofchars ob = new Q19countofchars();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string: ");
			String txt = sc.nextLine();		
			ob.dupchr(txt);
				
		}
	}	  