package com.Practise2;

public class PrintMiddleCharacterofString {
	public static void printMiddleCharacter(String str) {
		
		int vtl = str.length();
		int middle = vtl / 2;
		System.out.println(str.charAt(middle));
	}
	
	public static void main(String[] args) {
		
		String str = "WelcomeToVtalent";
		printMiddleCharacter(str);
	}

}
