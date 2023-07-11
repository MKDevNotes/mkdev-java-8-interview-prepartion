package com.mkdev.java8.employee.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.mkdev.java8.employee.repository.PersonRepository;
import com.mkdev.java8.employee.repository.model.Person;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class StreamFlatMapExample {
	
	static List<String> getPersonWithDuplicateHobbies(List<Person> personlist) {
		 return personlist.stream()
						.map(Person :: getHobbies)
						.flatMap(List :: stream)
						.collect(Collectors.toList());
	}
	
	
	static List<String> getPersonHobbies(List<Person> personlist) {
		 return personlist.stream()
						.map(Person :: getHobbies)
						.flatMap(List :: stream)
						.distinct()
						.collect(Collectors.toList());
	}
	
	static List<String> getPersonSortedHobbies(List<Person> personlist) {
		 return personlist.stream()
						.map(Person :: getHobbies)
						.flatMap(List :: stream)
						.distinct()
						.sorted()
						.collect(Collectors.toList());
	}
	
	static long getPersonCountHobbies(List<Person> personlist) {
		 return personlist.stream()
						.map(Person :: getHobbies)
						.flatMap(List :: stream)
						.distinct()
						.sorted()
						.count();
	}
	
	public static void main(String[] args) {
	
		System.out.println(" ======= Get All Hobbies ======= ");
		getPersonWithDuplicateHobbies(PersonRepository.getAllPersons()).forEach( h -> System.out.print(" "+h));
		System.out.println(" ");
		System.out.println(" ======= Get Distinct Hobbies ======= ");
		getPersonHobbies(PersonRepository.getAllPersons()).forEach( h -> System.out.print(" "+h));
		System.out.println(" ");
		System.out.println(" ======= Get Distinct sorted Hobbies ======= ");
		getPersonSortedHobbies(PersonRepository.getAllPersons()).forEach( h -> System.out.print(" "+h));
		System.out.println(" ");
		System.out.println(" ======= Get Distinct Hobbies Count ======= ");
		System.out.println(" Count :- "+getPersonCountHobbies(PersonRepository.getAllPersons()));
	}
}
