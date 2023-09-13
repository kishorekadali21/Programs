package com.streamAPI;

import java.util.Arrays;
import java.util.List;

public class DistinctDemo {
	public static void main(String[] args) {
		
		List<String> cars = Arrays.asList("BMW", "Skoda", "Rangerover", "Toyota", "Suzuki");
		cars.stream().limit(4).forEach(System.out::println);
	}

}
