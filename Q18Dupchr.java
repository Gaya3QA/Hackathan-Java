//Q18
package Hackathon;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
public class Q18Dupchr{
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
		  for(Entry<Character, Integer> entry:hm.entrySet()) {
			  if(entry.getValue()>1) {
				  System.out.println("Duplicate characters are: "+entry.getKey());
			  }
		  }
		  
		 
	  }
	  public static void main(String[] args) {
			Q18Dupchr ob = new Q18Dupchr();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string: ");
			String txt = sc.nextLine();		
			ob.dupchr(txt);
				
		}
	}	  