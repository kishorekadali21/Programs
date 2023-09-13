package com.Arrays;

public class PositiveNegativeandZerofromArray {
	public static void main(String[] args) {
		int arr [] = {-55,-45,-35,-25,-15,0,15,25,35,45,55};
		int positive = 0;
		int negative = 0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]>0) {
				positive++;
			}
			else if(arr[i]<0) {
				negative++;
				
			}
			else {
				System.out.println("Zero in the array = 1");
			}
		}
		System.out.println("Positive numbers in the array = "+ positive);
		System.out.println("Negative numbers in the array = "+ negative);
	}

}
