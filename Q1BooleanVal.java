//Q1
package Hackathon;
public class Q1BooleanVal{
	static Boolean booleancheck(boolean a, boolean b, boolean c){
		 int count =0;
	     if(a) {
	    	 count++;
	     }
	     if(b) {
	    	 count++;
	     }
	    
	     if(c) {
	    	 count++;
	     }
	    
	     if(count>=2) {
	    	 return true;
	     }
	     else {
	    	 return false;
	     }
		
	}
	public static void main(String[] args) {
	
     boolean a=true;
     boolean b=true;
     boolean c=false;
     System.out.println(booleancheck(a, b, c));
     
    	 
	}	
}