package com.practise;

public class IterateThroughstring {
	public static void main(String[] args) {
		String name = "srinivas";
		
		System.out.println("Charateters in "+ name + "are:");
		
		for(int i=0;i<name.length();i++) {
			
			char a = name.charAt(i);
			System.out.println(a +", ");
		}
	}

}
