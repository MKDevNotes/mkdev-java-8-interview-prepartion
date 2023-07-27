package com.mkdev.java8.lamda.streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class NumericStreamFactoryMethodExample {

	public static void main(String[] args) {
		IntStream intStream = IntStream.range(1, 6); // n-1 
		IntStream intStreamRangeClose = IntStream.rangeClosed(1, 6);
		
		intStream.forEach(System.out::println);
		System.out.println("===============");
		intStreamRangeClose.forEach(System.out::println);
		
		
		LongStream longStream = LongStream.range(1, 10);
		LongStream longStreamRangeClose = LongStream.rangeClosed(1, 10);
		longStream.forEach(System.out::println);
		System.out.println("===============");
		//longStreamRangeClose.forEach(System.out::println); 
			
		longStreamRangeClose.asDoubleStream().forEach(System.out::println);
		System.out.println("===============");
		DoubleStream ds = LongStream.range(1, 10).asDoubleStream();
		
		ds.forEach(System.out::println);
		
	}
	
}
