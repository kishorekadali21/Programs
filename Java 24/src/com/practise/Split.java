package com.practise;

public class Split {
	public static void main(String[] args) {
		
		String s1 = "Hi@Team@welcome@to@Vtalent";
		String[] split = s1.split("@");
		for(String str:split) {
			System.out.println(str);
		}
	}

}
