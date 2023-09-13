package com.Practise2;

public class CountnoOfDigitsinString {
	public static void main(String[] args) {
		String str = "My password is : 3043" ;
		
		int digits = 0;
		for (int i = 0; i< str.length();i++) {
			if (Character.isDigit(str.charAt(i)))digits++ ;
		}
		System.out.println("Total number of Digits = " + digits);
	}

}
