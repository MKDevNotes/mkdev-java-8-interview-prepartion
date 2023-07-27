package com.mkdev.java8.lamda.streams.terminal.operation;

import java.util.stream.Collectors;

import com.mkdev.java8.employee.repository.PersonRepository;
import com.mkdev.java8.employee.repository.model.Person;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class StreamMappingSumAvgExample {
	
	static int sumOfTotalKids() {
		return PersonRepository
				.getAllPersons()
				.stream()
				.collect(Collectors.summingInt(Person :: getKids));
	}
	
	static double averageHeight() {
		return PersonRepository
				.getAllPersons()
				.stream()
				.collect(Collectors.summingDouble(Person :: getHeight));
	}
	
	public static void main(String[] args) {

		System.out.println("Sum of Total kids "+sumOfTotalKids());
		System.out.println("Average "+averageHeight());
		
	}
}
