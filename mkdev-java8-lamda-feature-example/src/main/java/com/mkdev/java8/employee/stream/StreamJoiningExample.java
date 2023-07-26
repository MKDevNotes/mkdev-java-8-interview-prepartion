package com.mkdev.java8.employee.stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class StreamJoiningExample {
	public static void main(String[] args) {
		Stream<String> words = Arrays.asList("A", "B", "C", "D").stream();
		Stream<String> words1 = Arrays.asList("A", "B", "C", "D").stream();
		Stream<String> words2 = Arrays.asList("A", "B", "C", "D").stream();
		
	    String joinedString = words.collect(Collectors.joining());    //ABCD
	     
	    System.out.println( joinedString ); 
	 
	    joinedString = words1.collect(Collectors.joining(","));    //A,B,C,D
	     
	    System.out.println( joinedString );
	    
	    joinedString = words2.collect(Collectors.joining(",", "{", "}"));  //{A,B,C,D}
	     
	    System.out.println( joinedString );
	}
}
