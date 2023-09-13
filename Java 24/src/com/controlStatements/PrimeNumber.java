package com.controlStatements;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int x=3,i;
		int count=0;
		if(x>1) {
			for(i=1;i<=x;i++) {
				count++;
			}
		}
		if (count==2) {
			System.out.println("its prime");
		}
		else {
			System.out.println("its not prime");
		}
	}
	

}
