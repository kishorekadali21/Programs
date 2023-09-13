package com.Practise2;

public class ConvertStringValuetoByteValue {
	public static byte convertStringToByte(String str) {
		
		return Byte.parseByte(str);
		
	}
	
	public static void main(String[] args) {
		String stringValue = "2";
		 byte byteValue;
		 byteValue = convertStringToByte(stringValue);
		 System.out.println( stringValue+ " after converting into byte = " + byteValue);
		
	}

}
