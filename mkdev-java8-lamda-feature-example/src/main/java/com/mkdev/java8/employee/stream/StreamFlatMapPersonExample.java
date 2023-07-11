package com.mkdev.java8.employee.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class StreamFlatMapPersonExample {
	public static void main(String[] args) {
		List<Integer> oddNumber = Arrays.asList(1,3,5,7);
		List<Integer> evenNumber = Arrays.asList(2,4,6,8);
		
		List<List<Integer>> listoflist = Arrays.asList(oddNumber,evenNumber);
		System.out.println("List combine "+listoflist);
		
		List<Integer> flattenList = listoflist.stream()
											   .flatMap(list -> list.stream())
											   .sorted()
											   .collect(Collectors.toList());
		
		flattenList.forEach( i -> System.out.print(" "+i));
	}
}
