package com.mkdev.java8.lamda.streams.parallel;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class SequentialParallelExample {

	static void printStream(IntStream intStream) {
		intStream.forEach(s -> System.out.println(LocalDate.now() + " " + s + " " + Thread.currentThread().getName()));

		try {
			Thread.sleep(200);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		System.out.println("Available processor : "+Runtime.getRuntime().availableProcessors());
		int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	//	IntStream intStream = Arrays.stream(intArray);
		
		System.out.println("--------------Print numbers in Sequential ----------------");
		printStream(Arrays.stream(intArray).sequential());
		System.out.println("--------------Print numbers in Parallel ----------------");
		printStream(Arrays.stream(intArray).parallel());
	}

}
