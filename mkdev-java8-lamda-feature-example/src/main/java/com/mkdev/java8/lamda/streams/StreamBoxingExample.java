package com.mkdev.java8.lamda.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Muthukumar Thangavinayagam
 *
 */

public class StreamBoxingExample {

	static List<Integer> boxingMethod() {
		return IntStream
				.rangeClosed(1, 50) // primitive int
				.boxed() // boxing
				.collect(Collectors.toList()); // Collect as List
	}

	static int calculateSum(List<Integer> list) {
	
		return list.stream()
				.mapToInt(Integer :: intValue) // Map do the converting
				.sum(); // performing sum operation.
		
	}
	
	public static void main(String[] args) {
		
		boxingMethod().forEach(System.out::println);
		System.out.println("Sum of : "+calculateSum(boxingMethod()));
	}
}
