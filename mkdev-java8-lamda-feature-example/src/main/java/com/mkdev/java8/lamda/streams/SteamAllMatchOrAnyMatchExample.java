package com.mkdev.java8.lamda.streams;

import java.util.Arrays;
import java.util.List;
/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class SteamAllMatchOrAnyMatchExample {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple","Orange","Banana","Pineapple","Grape","Watermelon");
		
		System.out.println("All Match : "+fruits.stream().allMatch(s->s.length() == 5));
		System.out.println("Any Match : "+fruits.stream().anyMatch(s->s.length() == 5));
		
		
	}
	
}
