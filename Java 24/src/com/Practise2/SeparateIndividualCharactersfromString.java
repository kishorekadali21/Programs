package com.Practise2;

public class SeparateIndividualCharactersfromString {
	public static void main(String[] args) {
		String str = "WelcometoVtalent";
		
		System.out.println("Individual characters from given string: ");
		
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
	}

}
