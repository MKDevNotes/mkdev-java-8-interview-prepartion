package com.mkdev.java8.employee.stream;

import java.util.Optional;
import java.util.function.Predicate;

import com.mkdev.java8.employee.repository.EmployeeRepository;
import com.mkdev.java8.employee.repository.model.EmployeeBean;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class StreamMapFilterReduceExample {

	public static void main(String[] args) {
	
	Optional<Double> totalEmployeesSalary = EmployeeRepository.getAllEmployeeDetails()
						  .stream()
						  .map(EmployeeBean :: getSalary)
						  .reduce(Double :: sum);
	
	System.out.println("totalEmployeesSalary "+totalEmployeesSalary);
	
	
	Optional<Double> filterByDepartmentAndGender = EmployeeRepository.getAllEmployeeDetails()
			  .stream()
			  .filter(job -> job.getJobTitle().equalsIgnoreCase("Project Manager"))
			  .filter(gender -> gender.getGender().equalsIgnoreCase("male"))
			  .map(EmployeeBean :: getSalary)
			  .reduce(Double :: sum);

		System.out.println(" Total Project Manager Salary "+filterByDepartmentAndGender);
		
		Predicate<EmployeeBean> empDepart = (emp) -> emp.getJobTitle().equalsIgnoreCase("Project Manager"); 
		Predicate<EmployeeBean> empGender = (emp) -> emp.getGender().equalsIgnoreCase("female");
		
		Optional<Double> filterByDepartmentAndGender1 = EmployeeRepository.getAllEmployeeDetails()
				  .stream()
				  .filter(empDepart.and(empGender))
				  .map(EmployeeBean :: getSalary)
				  .reduce(Double :: sum);
		System.out.println(" Total Project Manager Salary "+filterByDepartmentAndGender1);
	}
	
}
