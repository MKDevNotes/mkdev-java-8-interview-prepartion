package com.mkdev.java8.lamda.streams;

import java.util.stream.IntStream;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class NumericStreamMapExample {
	
	static double mapToDouble() {
		return IntStream
				.rangeClosed(1, 10)
				.mapToDouble(x -> x)
				.sum();
	}
	
	static Long mapToLong() {
		return IntStream
				.rangeClosed(1, 10)
				.mapToLong(x -> x)
				.sum();
	}
	
	public static void main(String[] args) {

		System.out.println("Map to Double "+mapToDouble());
		System.out.println("Map to Long "+mapToLong());
	}
}
