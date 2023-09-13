package com.Arrays;

public class LargestNumber {
	public static void main(String[] args) {
		
		int arr [] = {12,-15,14,23,-14,156,356};

		  int max = arr[0];

		  for (int i = 0; i<arr.length; i++) {
		    if (arr[i]>max) {
		    	max = arr[i];
		    }
		  }
		  System.out.println("Maximum value = "+max);
	}
}
