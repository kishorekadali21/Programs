package com.Arrays;

public class SmallestArray {
	public static void main(String[] args) {
		int a[] = {10,-10, 20, -20, 40};
		int min = a[0];
		for (int i=0;i<a.length; i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println("Minimum value = "+min);
		
	}

}
