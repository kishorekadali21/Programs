package com.Arrays;

public class CompareTwoArrays {
	public static void main(String[] args) {
		int a1[] = {10,20,30,40,50};
	    int a2[] = a1;
	    int a3[] = {10,20,30,40,50};
	    int a4[] = {15,25,35,45,55};
	    
	    if(a1 == a2) {
	      System.out.println("a1 & a2 are same");
	    } else {
	      System.out.println("a1 & a2 are not same");
	    }

	    if(a1 == a3) {
	      System.out.println("a1 & a3 are same");
	    }else {
	      System.out.println("a1 & a3 are not same");
	    }
	    // compare arr1 and arr4
	    if(a1 == a4) {
	      System.out.println("a1 & a4 are same");
	    } else { 
	      System.out.println("a1 & a4 are not same");
	  }
	}

}
