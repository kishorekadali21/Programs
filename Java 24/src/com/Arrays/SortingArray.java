package com.Arrays;

public abstract class SortingArray {
	public static void main(String[] args) {
		int [] arr= {60, 30, 45, 35, 55};
		int min = arr[0];
		int max = arr[0];
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>max) {
				max = arr [i];
			}
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum value = "+min);
		System.out.println("Maximum value = "+max);
	}

}
