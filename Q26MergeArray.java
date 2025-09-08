package Hackathon;

import java.util.Scanner;
import java.util.Arrays;

public class Q26MergeArray{
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,4,6,9,10,0,0,0,0};
		int[] arr2 = {3,5,7,8};
		int k=0;
		for(int i=0;i<=arr1.length-1;i++) {
			if(arr1[i] == 0) {
				arr1[i] = arr2[k];
				k++;
			}
		}
		Arrays.sort(arr1);
		for(int i=0; i<=arr1.length-1;i++) {
			System.out.println(arr1[i]);
		}
		
	}
	}