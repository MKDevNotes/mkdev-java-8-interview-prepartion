package com.mkdev.java8.lamda.streams;

import java.util.Arrays;
import java.util.List;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class StreamLimitAndSkipExample {
	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("Apple","Orange","Banana","Pineapple","Grape","Watermelon");
		
		System.out.println("=======================list of all elements ");
		fruits.stream().forEach(System.out::println);
		System.out.println("=======================limit first 3 elements ");
		fruits.stream().limit(3).forEach(System.out::println);
		System.out.println("=======================Skip first 3 elements ");
		fruits.stream().skip(3).forEach(System.out::println);
		
		
		List<Integer> listofIntegers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println("==============================================");
		int sumof = listofIntegers.stream()
				.reduce(0,(x,y)-> (x+y));
		System.out.println("SumOf "+sumof);
		System.out.println("==============================================");
		
		int sumoflimit = listofIntegers.stream()
										.limit(3)
										.reduce(0,(x,y)-> (x+y));
		
		System.out.println("SumOfLimit "+sumoflimit);
		
		System.out.println("==============================================");
		
		int sumofSkip = listofIntegers.stream()
				.skip(3)
				.reduce(0,(x,y)-> (x+y));

		System.out.println("SumOfSkip "+sumofSkip);
		
	}
}
