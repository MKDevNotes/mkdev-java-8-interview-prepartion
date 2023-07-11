package com.mkdev.java8.employee.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.mkdev.java8.employee.repository.PersonRepository;
import com.mkdev.java8.employee.repository.model.Person;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class StreanMapPersonExample {

	 static List<String> toUpperTransForm(List<Person> listOfPerson) {
			return listOfPerson.stream()
								.map(Person::getName)
								.map(String::toUpperCase)
								.collect(Collectors.toList());
	 }
	 
	 static Set<String> toUpperTransFormSet(List<Person> listOfPerson) {
			return listOfPerson.stream()
								.map(Person::getName)
								.map(String::toUpperCase)
								.collect(Collectors.toSet());
	 }
	 
	public static void main(String[] args) {
		System.out.println(toUpperTransForm(PersonRepository.getAllPersons()));
		System.out.println(toUpperTransFormSet(PersonRepository.getAllPersons()));
	}
	
}
