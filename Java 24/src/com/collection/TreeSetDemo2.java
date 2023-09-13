package com.collection;

import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		
		TreeSet<Integer> t= new TreeSet<>(new MyComparator());
		
		t.add(10);
		t.add(0);
		t.add(16);
		t.add(3);
		t.add(5);
		t.add(25);
		t.add(25);
		
		System.out.println(t);
		
		
	}

}
