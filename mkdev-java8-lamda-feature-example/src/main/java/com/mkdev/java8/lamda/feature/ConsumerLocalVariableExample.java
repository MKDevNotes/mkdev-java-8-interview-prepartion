package com.mkdev.java8.lamda.feature;

import java.util.function.Consumer;

/**
 * @author Muthukumar Thangavinayagam
 * 
 * Created on 10-07-2023
 */
public class ConsumerLocalVariableExample {

	static int k = 0;
	
	public static void main(String[] args) {
		
		int i = 10;
		
		Consumer<Integer> con1 = (j) -> {
			k = 15;
			System.out.println("Print k "+k);
			System.out.println("Value is "+ (i+j));
		};
		
		con1.accept(15);
	}
	
	
	
}
