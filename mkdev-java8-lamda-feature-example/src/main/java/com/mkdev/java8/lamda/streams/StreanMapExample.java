package com.mkdev.java8.lamda.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class StreanMapExample {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("Apple","Orange","Banana","Pineapple","Grape","Watermelon");
		
		fruits.stream().map(String :: length).collect(Collectors.toList()).forEach(System.out :: println);
	}
	
}
