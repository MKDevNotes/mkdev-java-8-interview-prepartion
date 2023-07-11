package com.mkdev.java8.employee.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class CollectionVsStreamExample {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
					 names.add("siddu");
					 names.add("loith");
					 names.add("muthu");
					 
		for (String string : names) {
			System.out.println(" First >>> "+string);
		}
		
		for (String string : names) {
			System.out.println(" Second >>> "+string);
		}
		
		Stream<String> stream = names.stream();
					   stream.forEach( n -> System.out.println(" <<< "+n));
					//	stream.forEach( n -> System.out.print(" <<< "+n)); second time cannot run the execution.
					// in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed   
	}
	
}
