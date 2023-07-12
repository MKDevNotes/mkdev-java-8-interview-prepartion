package com.mkdev.java8.employee.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.mkdev.java8.employee.repository.EmployeeRepository;
import com.mkdev.java8.employee.repository.model.EmployeeBean;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class StreamMinMaxByExample {
	public static void main(String[] args) {
		
		//EmployeeStreamReduceExample using reduce find max salary
		Optional<EmployeeBean> employeeMax = EmployeeRepository.getAllEmployeeDetails()
			.stream()
			.collect(Collectors.maxBy(Comparator.comparing(EmployeeBean :: getSalary)));
		
		System.out.println("Maximum salary : "+employeeMax.get().getEmployeeId()+"  "+employeeMax.get().getSalary());
		
		Optional<EmployeeBean> employeeMin = EmployeeRepository.getAllEmployeeDetails()
				.stream()
				.collect(Collectors.minBy(Comparator.comparing(EmployeeBean :: getSalary)));
			
		System.out.println("Minimum salary : "+employeeMin.get().getEmployeeId()+"  "+employeeMin.get().getSalary());
		
		EmployeeRepository.getAllEmployeeDetails().stream()	.filter(emp -> emp.getSalary() == emp.getSalary()).collect(Collectors.toList());
			
	}

}
