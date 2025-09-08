//Q20
package Hackathon;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
public class Q20countofdup{
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
			  if(Character.isLowerCase(entry.getKey())) {
			   if(entry.getValue()>1) {
				  System.out.println("Count of repeated Lower case letter is : "+entry.getKey()+":"+entry.getValue());
			  }
		  }

			  if(Character.isUpperCase(entry.getKey())) {
				   if(entry.getValue()>1) {
					  System.out.println("Count of repeated Upper case letter is : "+entry.getKey()+":"+entry.getValue());
				  }
			  }
			  if(Character.isDigit(entry.getKey())) {
				   if(entry.getValue()>1) {
					  System.out.println("Count of repeated digit is : "+entry.getKey()+":"+entry.getValue());
				  }
			  } 
		  }
			  
		  }		  		 	  
	  public static void main(String[] args) {
		  Q20countofdup ob = new Q20countofdup();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string: ");
			String txt = sc.nextLine();		
			ob.dupchr(txt);
				
		}
	}	  