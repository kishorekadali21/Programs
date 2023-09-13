package com.Arrays;

public class MergedArray {
	public static void main(String[] args) {
		int ar1 [] = {11,22,33,44,55};
		int ar2 [] = {66,77,88,99,100};
		int ar3 [] = new int[ar1.length + ar2.length];
		for (int i=0; i<ar1.length; i++) {
			ar3[i] = ar1[i];
		}
		for (int i=0;i<ar2.length; i++) {
			ar3[ar1.length+i] = ar2[i];
		}
		for (int a : ar3) {
			System.out.print(a+" ");
		}
	}

}
