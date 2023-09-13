package com.exceptionprograms;

public class UserDefinedException {
	public static void main(String[] args) {
		try {
			System.out.println("Creating our own Exception Object");
			throw new MyException("User Defined Exception");
		} catch (MyException ex) {
			System.out.println("Catch User Defined Exception");
			System.out.println(ex.getMessage());
		}
	}

}
