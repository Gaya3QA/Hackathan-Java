//Q31
package Hackathon;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Q31FileReverse{		
	public static void main(String[] args) throws IOException {
		String userDir = System.getProperty("user.dir");
		String source = userDir+"\\src\\Textfiles\\Q31file.txt";
		String target = userDir+"\\src\\Textfiles\\Q31filewrite.txt";
		FileReader fr = new FileReader(source);
		FileWriter fw = new FileWriter(target);
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);		
		List<String> al =new ArrayList<String>();
		String str;		
		  do{
			    str=br.readLine();
		        al.add(str);
		       
		 }while(str!=null);
		for(int i=al.size()-2;i>=0;i--) {			 
		       String rs = al.get(i);		       
			   bw.write(rs);
	           bw.write("\n"); 
		  }
		bw.close();
		br.close();
	}
}
