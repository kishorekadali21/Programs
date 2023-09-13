package com.collection;

import java.util.LinkedList;

public class LinkedListDemo { 
	public static void main(String[] args) {
		LinkedList<Object> l = new LinkedList<>();
		
		l.add("kishore");
		l.add("25");
		l.add(null);
		l.add("kishore");
		System.out.println(l);
		
		l.set(0,"kumar");
		l.set(0,"Kittu");
		
		
		System.out.println(l);
		l.removeLast();
		l.addFirst("Dhatsol");
		System.out.println(l);
		
	}
}
