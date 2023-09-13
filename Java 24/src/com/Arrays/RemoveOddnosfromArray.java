package com.Arrays;

public class RemoveOddnosfromArray {
	public static void main(String[] args) {
		
		int arr [] = {9,8,7,6,5,4,3,2,1};
		int even [] = new int[arr.length/2];
		int a=0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]% 2 ==0) {
				even[a++] = arr[i];
			}
		}
		System.out.println("Array after removing Odd Numbers");
		for (int m=0;m<even.length;m++) {
			System.out.print(even[m]);
		}
		      System.out.println();
	}

}
