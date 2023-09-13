package com.practise;

public class Intern {
	public static void main(String[] args) {
		
		String s1 = "Vtalent";
		String s2 = s1.intern();
		System.out.println(s1==s2);
	}

}
