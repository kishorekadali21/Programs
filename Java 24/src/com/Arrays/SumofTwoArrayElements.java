package com.Arrays;

public class SumofTwoArrayElements {
	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {11,22,33,44,55};
		int[] arr3 = new int[arr1.length];
		for(int i=0; i<arr1.length;i++) {
			arr3[i] = arr1[i] + arr2[i];
			
		}
		for (int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]+" ");
		}
	}

}
