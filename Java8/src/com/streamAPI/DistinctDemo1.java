package com.streamAPI;

import java.util.Arrays;
import java.util.List;

public class DistinctDemo1 {
	public static void main(String[] args) {
		
		List<String> toyotacars = Arrays.asList("Fortuner", "Camry", "Vellfire", "Urbancruiser", "Hycross", "Innova Crysta");
		toyotacars.stream().skip(2).forEach(System.out::println);
	}

}
