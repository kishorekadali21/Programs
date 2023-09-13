package com.Practise2;

public class IterateOverCharactersinString {
	static void getChar(String str) {
		
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i)); 
			
			System.out.print(" ");
		}
	}
	
	public static void main(String[] args) {
		String str = "Welcome to Vtalent";
		
		getChar(str);
		
	}

}
