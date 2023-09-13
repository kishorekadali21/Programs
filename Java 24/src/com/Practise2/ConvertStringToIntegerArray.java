package com.Practise2;

import java.util.Arrays;

public class ConvertStringToIntegerArray {
	public static void main(String[] args) {
		
		String str = "[2,3,456,789,3043]";
		String[] string = str.replaceAll("\\[",  "").replaceAll("]", "").split(",");
		
		int[] arr = new int[string.length];
		
		for (int i = 0; i < string.length; i++) {
			arr[i] = Integer.valueOf(string[i]);
			
		}
		System.out.print("String : " + str);
		System.out.print("\nInteger array : "+ Arrays.toString(arr));
	}

}
