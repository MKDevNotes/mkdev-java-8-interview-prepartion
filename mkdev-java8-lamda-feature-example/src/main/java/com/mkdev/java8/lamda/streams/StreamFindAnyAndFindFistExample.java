package com.mkdev.java8.lamda.streams;

import java.util.Arrays;
import java.util.List;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class StreamFindAnyAndFindFistExample {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple","Orange","Banana","Pineapple","Grape","Watermelon");
		
		System.out.println("Find Any "+fruits.stream().filter(s -> s.length() > 5).findAny());
		System.out.println("Find Fist "+fruits.stream().filter(s -> s.length() == 5).findFirst());
	}
	
}
