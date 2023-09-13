package com.collection;

import java.util.HashSet;

public class HashsetDemo {
	public static void main(String[] args) {
		HashSet<Object>h=new HashSet<>();
		
		h.add("B");
		h.add("c");
		h.add("D");
		h.add("D");
		h.add(null);
		h.add(10);
		
		System.out.println(h.add("z"));
		System.out.print(h);;
	}

}
