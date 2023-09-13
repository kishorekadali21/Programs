package com.Arrays;

public class OddEvenArray {
	public static void main(String[] args) {
		int arr[] = {4, 8, 11, 15, 20, 25, 30};
		int odd = 0;
		int even = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]%2==0)
				++even;
			else
				++odd;
		}
		System.out.println("Count of the even numbers = "+even);
		System.out.println("Count of the odd numbers = "+odd);
	}
}
