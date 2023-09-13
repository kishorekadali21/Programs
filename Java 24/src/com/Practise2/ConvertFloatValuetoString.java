package com.Practise2;

public class ConvertFloatValuetoString {
	public static String convertFloatToString(float floatValue) {
		String stringValue = "" + floatValue;
		return (stringValue);
	}
	
	public static void main(String[] args) {
		
		float floatValue = 1f;
		
		String stringValue;
		stringValue = convertFloatToString(floatValue);
		System.out.println(floatValue + " after converting into string = " + stringValue);
	}

}
