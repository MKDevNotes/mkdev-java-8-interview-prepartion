package com.mkdev.java8.lamda.streams.terminal.operation;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;
import com.mkdev.java8.employee.repository.PersonRepository;
import com.mkdev.java8.employee.repository.model.Person;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class StreamMappingExample {
	
	static List<String> mappingName(){
		//PersonRepository.getAllPersons().stream().map(Person :: getName).collect(Collectors.toList());
		
		return PersonRepository.getAllPersons()
								.stream()
								.collect(mapping(Person :: getName, Collectors.toList()));
	}
	
	static long countMaleEmployee() {
		 
		return PersonRepository.getAllPersons()
				.stream()
				.filter(per -> per.getGender().equalsIgnoreCase("male"))
				.collect(Collectors.counting());
	}
	public static void main(String[] args) {
		mappingName().forEach(System.out::println);
		
		System.out.println(" Count "+countMaleEmployee());
	}
}
