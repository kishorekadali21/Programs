package com.Practise2;

public class ConvertByteValueToStringValue {
	public static String convertByteToString(byte byteValue) {
		
		String stringValue = "" + byteValue;
		return (stringValue);
	}
	
	public static void main(String[] args) {
		byte byteValue = 1;
		String stringValue;
		
		stringValue = convertByteToString(byteValue);
		System.out.println(byteValue + " after converting into string =" + stringValue);
	}

}
