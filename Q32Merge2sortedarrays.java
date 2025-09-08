//Q32
package Hackathon;

import java.util.Arrays;
import java.util.Random;

public class Q32Merge2sortedarrays{

  public static void main(String[] args) {
	  Random rand = new Random();
	    int[] a = new int[5];
        int[] b = new int[6];

        for (int i = 0; i < a.length-1; i++) {
  	      a[i] = rand.nextInt(100);
  	    }
       Arrays.sort(a);
        System.out.println("A: "+Arrays.toString(a));
        for (int i = 0; i < b.length-1; i++) {
  	      b[i] = rand.nextInt(100);
  	    } 
        System.out.println("B: "+Arrays.toString(b));
       Arrays.sort(b);
	  int[] answer = merge(a, b);
	  for(int l=0;l<=answer.length-1;l++) {
		  System.out.println(answer[l]);
	  }
	  
  } 
  public static int[] merge(int a[], int b[]) {
	  int[] ans = new int[a.length+b.length];
	  System.out.println(ans.length);
	  int i=0,j=0,k=0;
	  while (i < a.length && j < b.length) {
		  if(a[i] < b[j]) {
			  ans[k] = a[i];
			  i++;
		  }
		  else {
			  ans[k] = b[j];
			  j++;
		  }
		  k++;
	   }
		 while(i<=a.length-1) {
			 ans[k] = a[i];	
			 i++;
			 k++;
			
	  }
		 while(j<=b.length-1) {
			 ans[k] = b[j];
			 j++;
			 k++;
			 
		 }
	  return ans;
  }
}

