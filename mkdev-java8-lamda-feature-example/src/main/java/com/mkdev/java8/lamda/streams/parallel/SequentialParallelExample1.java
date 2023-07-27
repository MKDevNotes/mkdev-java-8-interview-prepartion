package com.mkdev.java8.lamda.streams.parallel;

import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class SequentialParallelExample1 {

	public static void main(String[] args) {
		//System.out.println("Sequential "+getSumMethodUsingSequential());
		//System.out.println("Parallel   "+getSumMethodUsingParallel());
		
		System.out.println("Sequential "+checkPerformance(SequentialParallelExample1 ::getSumMethodUsingSequential,25));
		System.out.println("Parallel   "+checkPerformance(SequentialParallelExample1 ::getSumMethodUsingParallel,25));		
		
	}

	static int getSumMethodUsingSequential() {
		return IntStream.rangeClosed(1, 1000000).sequential().sum();
	}
	static int getSumMethodUsingParallel() {
		return IntStream.rangeClosed(1, 1000000).parallel().sum();
	}
	
	static long checkPerformance(Supplier<Integer> sum,int numOfTimes) {
		long start = System.currentTimeMillis();
		for(int i=0 ; i<= numOfTimes;i++) {
			sum.get();
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
}
