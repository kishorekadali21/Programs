package com.Arrays;

public class ArrayAVerage {
	 public static void main(String[] args) {

		    double array[] = {24, 20, 45, 60, 90};
		    double sum = 0.0;		   
		    double avg = 0.0;

		    for (int i=0; i<array.length; i++) {
		   
		      sum = sum + array[i];
		    }
		    
		    avg = sum/array.length;

		    System.out.println("Average: " + avg );
		  }

}
