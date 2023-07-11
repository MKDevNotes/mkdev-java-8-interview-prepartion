package com.mkdev.java8.employee.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.mkdev.java8.employee.repository.PersonRepository;
import com.mkdev.java8.employee.repository.model.Person;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class PersonHobbiesStream {

	public static void main(String[] args) {
		
		List<String> personHobbies = PersonRepository
				.getAllPersons() // iterate all the persons
				.stream() // Stream of persons
				.map(Person :: getHobbies) // List of stream
				.flatMap(List :: stream) // Stream into flat. Stream<String>
				.distinct()
				.collect(Collectors.toList()); // Collection to be return.
		

System.out.println(" Person Hobbies list : "+personHobbies);

	}
	
}
