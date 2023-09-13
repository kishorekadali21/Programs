package com.Array1;

public class EvenPositionElements {
	public static void main(String[] args) {
		int num[]= {13,7,66,15,98};
		System.out.println("Even Position of elements present in an array are");
		for(int i = 2;i < num.length;i=i+2) {
			System.out.print(num[i]+" ");
		}
	}

}
