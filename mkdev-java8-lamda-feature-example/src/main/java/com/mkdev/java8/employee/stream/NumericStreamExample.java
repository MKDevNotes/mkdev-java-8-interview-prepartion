package com.mkdev.java8.employee.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class NumericStreamExample {
	
	static BinaryOperator<Integer> bio = (x,y) -> x+y; 
	
	public static void main(String[] args) {

		List<Integer> li = Arrays.asList(5,7,6,2,1,4,32);
		
		//System.out.println(" Total is "+li.stream().reduce(0, (x,y) -> x+y));
		System.out.println(" Total is "+li.stream().reduce(0, bio));
		
		IntStream intStream = IntStream.range(1, 6);
		IntStream intStreamClose = IntStream.rangeClosed(1, 6);
		
		System.out.println(" IntStream using Total is "+intStream.sum()+" RangeClose "+intStreamClose.sum());
	}
}
 