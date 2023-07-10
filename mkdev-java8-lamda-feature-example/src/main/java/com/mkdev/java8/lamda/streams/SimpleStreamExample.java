package com.mkdev.java8.lamda.streams;

import java.util.stream.Stream;

/**
 * @author Muthukumar Thangavinayagam.
 * 
 * @created on 10-07-2023
 */
public class SimpleStreamExample {
	
	public static void main(String[] args) {
		Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,7,8,9,10);
		stream1.forEach(p -> System.out.println(p));
		System.out.println("=======================");
		Stream<Integer> stream2 = Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9,10});
		
		stream2.forEach(p -> System.out.println(p));
	}

}
