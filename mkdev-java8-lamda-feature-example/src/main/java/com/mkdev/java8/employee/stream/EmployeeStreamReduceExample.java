package com.mkdev.java8.employee.stream;

import java.util.Optional;

import com.mkdev.java8.employee.repository.EmployeeRepository;
import com.mkdev.java8.employee.repository.model.EmployeeBean;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class EmployeeStreamReduceExample {

	public static void main(String[] args) {
		
		String emailIds = EmployeeRepository.getAllEmployeeDetails()
											.stream()
											.map(EmployeeBean :: getEmail)
											.reduce("", (a,b) -> a.concat(",").concat(b));
		
		System.out.println("Employees Email IDs "+emailIds);
		

		Optional<EmployeeBean> employeeSalary = EmployeeRepository.getAllEmployeeDetails().stream().reduce((x,y) -> x.getSalary() > y.getSalary() ? x : y);
		System.out.println("Find Employees Higest Salary ");
		System.out.println("Employee Name "+employeeSalary.get().getFirstName()+" "+employeeSalary.get().getSalary());
	}
	
}
