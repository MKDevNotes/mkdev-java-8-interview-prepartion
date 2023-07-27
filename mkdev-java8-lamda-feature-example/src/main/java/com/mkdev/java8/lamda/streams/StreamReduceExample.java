package com.mkdev.java8.lamda.streams;

import java.util.Arrays;
import java.util.List;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class StreamReduceExample {

	public static void main(String[] args) {
		List<Integer> listofIntegers = Arrays.asList(1,3,4,5,6,8,9);
		int sum = listofIntegers.stream().mapToInt(i -> i).sum();
		
		System.out.println(" Sum "+sum);
		
		long count = listofIntegers.stream().mapToInt(i -> i).count();
		
		System.out.println(" Count "+count);
		
		System.out.println(" Result of Multiplication: "+listofIntegers.stream().reduce(1 , (a,b) -> (a*b)));
		// 1 * 1 = 1
		// 3 * 1 = 3 ....

		System.out.println(" Result of Addition : "+listofIntegers.stream().reduce(0 , (a,b) -> (a+b)));
		// 0 + 1 = 1
		// 3 + 1 = 4 ....
	}
	
}
