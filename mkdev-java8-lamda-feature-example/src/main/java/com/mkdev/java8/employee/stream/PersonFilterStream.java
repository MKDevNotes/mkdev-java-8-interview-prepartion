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
public class PersonFilterStream {

	public static void main(String[] args) {
		
		Predicate<Person> p1 = (person) -> person.getGender().equalsIgnoreCase("male");
		Predicate<Person> p2 = (person) -> person.getHeight() >=140;
		
		Map<String, List<String>> personMap = PersonRepository
												.getAllPersons() // iterate all the persons
												.stream() // Stream of persons
												.filter(p1) // filter by gender
												.filter(p2) // filter by height
												.collect(Collectors.toMap(Person::getName, Person::getHobbies));
		
		System.out.println(" Person Map "+personMap);
	}
	
}
