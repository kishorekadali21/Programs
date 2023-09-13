package com.Practise2;

public class MoveAllUppercaseLtrsToEnd {
	public static void main(String[] args) {
		String s = "HydERAbad";
		String newstr = "";
		String upper = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				upper += s.substring(i, i + 1);
			} else {
				newstr += s.substring(i, i + 1);
			}
		}
		System.out.println(newstr + upper);
		
	}

}
