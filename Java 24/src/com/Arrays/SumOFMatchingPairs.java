package com.Arrays;

public class SumOFMatchingPairs {
	
	public static void main(String[] args) {
		
		int arr[] = {4,3,6,9,8,1,8};
		
		int sum = 9;
		for(int i=0;i < arr.length; i++) {
			
			for(int j= i+1;j<arr.length;j++) {
				if (arr[i]+arr[j] == sum) {
					System.out.println(arr[i]+ "+" +arr[j] + "=" +sum);
				}
			}
		}
	}
}
