package com.mkdev.java8.employee.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class NumericStreamAggregationExample {

	public static void main(String[] args) {
		
		int[] intArray = {5,7,6,2,1,4,32};
		IntStream findMax = Arrays.stream(intArray);
		IntStream findMin = Arrays.stream(intArray);
		IntStream findAvg = Arrays.stream(intArray);
		System.out.println(" Get Max Value : "+findMax.max().getAsInt());
		System.out.println(" Get Min Value : "+findMin.min().getAsInt());
		System.out.println(" Get Avg Value : "+findAvg.average().getAsDouble());
		
	}
	
}
