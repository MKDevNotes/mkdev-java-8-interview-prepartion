package com.mkdev.java8.lamda.feature;

import java.util.function.Consumer;

/**
 * @author Muthukumar Thangavinayagam 
 * 
 * @created on 10-07-2023
 */
public class ConsumerExample {

	public static void main(String[] args) {
		
		Consumer<String> con1 = (s) -> { System.out.println(s.toUpperCase());};
		
		con1.accept("Hello world"); // pass the data into consumer.
		
		Consumer<String> con2 = (s) -> { System.out.println(s.toLowerCase());};
		
		con2.accept("Hello world"); // pass the data into consumer.
		
		con1.andThen(con2);
	}
	
	
}
