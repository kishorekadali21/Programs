package com.Arrays;

public class SumofEvenandOddinArray {
	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5,6,7,8,9};
		int even=0;
		int odd=0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]% 2==0) {
				even=even+arr[i];
			}
			else {
				odd=odd+arr[i];
			}
		}
		System.out.println(even + " sum of Even Number");
		System.out.println(odd + " sum of Odd Number");
	}

}
