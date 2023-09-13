package com.collection;

import java.util.TreeSet;

public class TreeSetDemo1 {
	public static void main(String[] args) {
		
		TreeSet<StringBuffer>t= new TreeSet<>();
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("Y"));
		System.out.println(t);
		
		}

}
