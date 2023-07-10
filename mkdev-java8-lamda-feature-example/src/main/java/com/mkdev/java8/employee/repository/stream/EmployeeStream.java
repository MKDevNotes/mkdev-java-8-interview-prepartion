package com.mkdev.java8.employee.repository.stream;

import java.util.Map;
import java.util.stream.Collectors;

import com.mkdev.java8.employee.repository.EmployeeRepository;
import com.mkdev.java8.employee.repository.model.EmployeeBean;

/**
 *  @author Muthukumar Thangavinayagam
 *
 */
public class EmployeeStream {

	public static void main(String[] args) {
		
		Map<String, String> employeeMap = EmployeeRepository.getAllEmployeeDetails()
				.stream()
				.collect(Collectors.toMap(EmployeeBean::getEmployeeId, EmployeeBean::getDepartment)); 
	
		System.out.println(employeeMap);
	}
	
}
