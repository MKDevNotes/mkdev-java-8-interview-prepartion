package com.mkdev.java8.employee.repository.stream;

import java.util.List;
import java.util.stream.Collectors;

import com.mkdev.java8.employee.repository.EmployeeRepository;
import com.mkdev.java8.employee.repository.model.EmployeeBean;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class EmployeeFilterStream {

	public static void main(String[] args) {
		
		List<EmployeeBean> emplFilter = EmployeeRepository.getAllEmployeeDetails().stream().filter(emp -> emp.getSalary() < 7000 && emp.getGender().equalsIgnoreCase("male")).collect(Collectors.toList());
		
		emplFilter.forEach(emp -> System.out.println(emp.getEmployeeId()+" "+emp.getFirstName().concat("").concat(emp.getLastName())));
		
	
	}
}
