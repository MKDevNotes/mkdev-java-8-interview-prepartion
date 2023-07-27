package com.mkdev.java8.lamda.streams.parallel;

import java.util.List;
import java.util.stream.Collectors;

import com.mkdev.java8.employee.repository.EmployeeRepository;
import com.mkdev.java8.employee.repository.model.EmployeeBean;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class EmployeeSequentialParallelExample {

	static List<String> getSequentialEmailIds() {
		long start = System.currentTimeMillis();

		List<String> employeeEmailIds = EmployeeRepository.getAllEmployeeDetails().stream().map(EmployeeBean::getEmail)
				.collect(Collectors.toList());
		long end = System.currentTimeMillis();
		System.out.println(" Sequential Time " + (end - start));
		return employeeEmailIds;
	}

	static List<String> getParallelEmailIds() {
		long start = System.currentTimeMillis();
		List<String> employeeEmailIds = EmployeeRepository.getAllEmployeeDetails().parallelStream()
				.map(EmployeeBean::getEmail).collect(Collectors.toList());
		long end = System.currentTimeMillis();
		System.out.println(" Parallel Time " + (end - start));
		return employeeEmailIds;
	}

	public static void main(String[] args) {

		System.out.println(" getSequentialEmailIds " + getSequentialEmailIds());
		System.out.println(" getParallelEmailIds " + getParallelEmailIds());
	}
}
