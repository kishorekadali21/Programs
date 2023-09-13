package com.StudentData;

public class Driver {
	public static void main(String[] args) {
		
		Driver d = new Driver();
		
		Student s = new Student();
		
		s.id = 103;
		
		s.name = "VARMA";
		
		d.print(s);
	}
	
	 void print(Student s) {
		 System.out.println(s.id +"  "+s.name);
	 }

}
