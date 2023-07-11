package com.mkdev.java8.employee.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.mkdev.java8.employee.repository.PersonRepository;
import com.mkdev.java8.employee.repository.model.Person;

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
					   
		List<String> person = PersonRepository.getAllPersons()
											  .stream()
											  .peek( p -> System.out.println(p))
											  .map(Person::getName)
											  .peek( p -> System.out.println(p))
											  .collect(Collectors.toList());
		
		
	}
	
}
