package com.Array1;

public class FactorialNumber {
	public static void main(String[] args) {
		int i,fact = 1;
		int number = 15;
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.print("Factorial of "+number+"is:"+fact);;
	}

}
