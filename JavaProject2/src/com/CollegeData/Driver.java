package com.CollegeData;

public class Driver {
	College m1() {
		
		College c = new College();
		c.id = 100;
		c.name = "RAMESH";
		
		return c;
	}
	
	public static void main(String[] args) {
		Driver d = new Driver();
		College c = d.m1();
		System.out.println(c.id+"--"+c.name);
	}

}
