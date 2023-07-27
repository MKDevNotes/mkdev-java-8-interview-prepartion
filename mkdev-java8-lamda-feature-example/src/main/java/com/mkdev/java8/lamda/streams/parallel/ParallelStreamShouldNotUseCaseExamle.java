package com.mkdev.java8.lamda.streams.parallel;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Muthukumar Thangavinayagam
 *
 */

public class ParallelStreamShouldNotUseCaseExamle {
	
	static int getSequentialCount(List<Integer> integerList) {
		long start = System.currentTimeMillis();
		int  totalSum = integerList.stream().reduce(0, (x,y) -> (x+y)); 
		long end = System.currentTimeMillis();
		System.out.println("Sequential Time "+(end-start));
		return totalSum;
	}
	
	
	static int getParallelCount(List<Integer> integerList) {
		long start = System.currentTimeMillis();
		int  totalSum = integerList.parallelStream().reduce(0, (x,y) -> (x+y)); 
		long end = System.currentTimeMillis();
		System.out.println("Parallel Time "+(end-start));
		return totalSum;
	}
	
	
	public static void main(String[] args) {

		List<Integer> intList = IntStream.rangeClosed(1, 1000000).boxed().collect(Collectors.toList());
		
		getSequentialCount(intList);
		getParallelCount(intList);
	}
}
