package com.java1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PfSalary {
	public static void main(String [] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		System.out.println("Enter the salary amount:");
		String str = br.readLine();
		double basicSalary = Double.parseDouble (str);
		double pf = basicSalary*12/100;
		System.out.println(pf);
	}

}
