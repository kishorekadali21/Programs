package com.Practise2;

public class RemoveGivenWordFromString {
	public static void main(String[] args) {
		
		String str = "This is the Power of Vtalent";
		String word = "the";
		
		str = str.replaceAll("the", "");
		str = str.trim();
		
		System.out.print(str);
		
	}

}
