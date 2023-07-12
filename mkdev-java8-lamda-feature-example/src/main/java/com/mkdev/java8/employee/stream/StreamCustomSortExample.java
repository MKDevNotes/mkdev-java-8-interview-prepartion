package com.mkdev.java8.employee.stream;

import java.util.Comparator;

import com.mkdev.java8.employee.repository.PersonRepository;
import com.mkdev.java8.employee.repository.model.Person;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class StreamCustomSortExample {

	public static void main(String[] args) {
		System.out.println("----------------------- Sort by name -----------------------");
		PersonRepository.getAllPersons().stream()
										.sorted(Comparator.comparing(Person::getName))
										.forEach(p -> System.out.println(p.getName()+" "+p.getSalary()));
		System.out.println("----------------------- Reverse Sort by name -----------------------");
		PersonRepository.getAllPersons().stream()
										.sorted(Comparator.comparing(Person::getName).reversed())
										.forEach(p -> System.out.println(p.getName()+" "+p.getSalary()));
	
	}
	
	
	
	
}
