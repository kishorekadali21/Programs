package com.streamAPI;

import java.util.Arrays;
import java.util.List;

public class MapDemo1 {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Vamsi", "Ramesh", "Mahesh", "Varun", "Venkat");
		
		names.stream().filter(name -> name.startsWith("V")).map(name -> name.length()).forEach(System.out::println);
	}

}
