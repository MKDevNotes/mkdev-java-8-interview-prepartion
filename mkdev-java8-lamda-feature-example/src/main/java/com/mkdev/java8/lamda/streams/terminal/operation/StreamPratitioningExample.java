package com.mkdev.java8.lamda.streams.terminal.operation;

import static java.util.stream.Collectors.partitioningBy;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.mkdev.java8.employee.repository.EmployeeRepository;
import com.mkdev.java8.employee.repository.model.EmployeeBean;

/**
 * @author Muthukumar Thangavinayagam
 *
 */

public class StreamPratitioningExample {

	static Predicate<EmployeeBean> employee = emp -> emp.getJobTitle().equalsIgnoreCase("HRManager");

	static void getEmployeeJobTitle() {
		Map<Boolean,List<EmployeeBean>> employeelist = EmployeeRepository
															.getAllEmployeeDetails()
															.stream().collect(partitioningBy(employee));
		System.out.println("Employee "+employeelist);
	}
	
	static void getEmployeeJobTitleWith2Param() {
		Map<Boolean,Set<EmployeeBean>> map =EmployeeRepository.getAllEmployeeDetails()
		.stream()
		.collect(partitioningBy(employee,Collectors.toSet()));
		System.out.println("Employee Map 2:"+map);
	}
	
	static void getEmployeeJobTitleWithMap() {
		Map<Boolean, Map<String, String>> map =EmployeeRepository.getAllEmployeeDetails()
		.stream()
		.collect(partitioningBy(employee,Collectors.toMap(EmployeeBean :: getEmployeeId, EmployeeBean ::getJobTitle)));
		System.out.println("Employee Map 3:"+map);
	}

	
	public static void main(String[] args) {
		
		//getEmployeeJobTitle();
		//getEmployeeJobTitleWith2Param();
		getEmployeeJobTitleWithMap();
	}
	
}
