package com.mkdev.java8.employee.stream;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class StreamFactoryMethodExample {
	static UnaryOperator<Integer> add = x -> x+5;
	
	public static void main(String[] args) {
		Stream<Integer> s1 = Stream.iterate(0, add).limit(11);
		
		s1.forEach(System.out::println);

		Stream<Double> s2 = Stream.generate(Math::random).limit(10);
		
		s2.forEach(System.out::println);
		
		Stream<String> s3 = Stream.of("One","Two","Three","four");
		
		s3.forEach(System.out::println);
	}
	
}
