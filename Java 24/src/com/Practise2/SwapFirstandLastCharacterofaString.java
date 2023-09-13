package com.Practise2;

public class SwapFirstandLastCharacterofaString {
	public static String swapFirstAndLast(String str) {
		
		if (str.length() < 2)
			return str;
		
		char[] ch = str.toCharArray();
		
		char temp = ch[0];
		ch[0] = ch[ch.length - 1];
		ch[ch.length - 1] = temp;
		
		return String.valueOf(ch);
	}
	
	public static void main(String[] args) {
		String str = "TelcomeToVtalenW";
		System.out.println(swapFirstAndLast(str));
	}

}
