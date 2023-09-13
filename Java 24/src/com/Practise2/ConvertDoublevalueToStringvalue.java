package com.Practise2;

public class ConvertDoublevalueToStringvalue {
	public static String convertDoubleToString(double doubleValue) {
		
		
		String stringValue = "" + doubleValue;
		
		return stringValue;
	}
	
	public static void main(String[] args) {
		
		double doubleValue = 1;
		String stringValue;
		stringValue = convertDoubleToString(doubleValue);
		System.out.println(
	            doubleValue
	            + " after converting into string = "
	            + stringValue);
		
	}

}
