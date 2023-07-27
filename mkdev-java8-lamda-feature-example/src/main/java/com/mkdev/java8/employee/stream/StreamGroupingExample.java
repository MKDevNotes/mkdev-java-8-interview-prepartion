package com.mkdev.java8.employee.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.mkdev.java8.employee.repository.EmployeeRepository;
import com.mkdev.java8.employee.repository.model.EmployeeBean;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class StreamGroupingExample {
	public static void main(String[] args) {

		Map<String, List<EmployeeBean>> employeeGroupByDepart = EmployeeRepository.getAllEmployeeDetails().stream()
				.collect(Collectors.groupingBy(EmployeeBean::getDepartment));

		// employeeGroupByDepart.entrySet().forEach(emp ->
		// System.out.println(emp.getKey()+" "+emp.getValue()));
		// Stream.of(employeeGroupByDepart).forEach(System.out::println);

		for (Map.Entry<String, List<EmployeeBean>> emp : employeeGroupByDepart.entrySet()) {
			System.out.println("================== Department :: "+emp.getKey()+" ::=================="); 
			List<EmployeeBean> empList = emp.getValue();
			for (EmployeeBean employeeBean : empList) {
			System.out.println(" "+employeeBean.getEmployeeId()+" "+employeeBean.getFirstName() +" "+employeeBean.getJobTitle());	
			}
			System.out.println("======================================================================");
			Map<String, List<EmployeeBean>> employeeGroupByJobTitle = EmployeeRepository.getAllEmployeeDetails().stream()
					.collect(Collectors.groupingBy(EmployeeBean::getJobTitle));

			// employeeGroupByDepart.entrySet().forEach(emp ->
			// System.out.println(emp.getKey()+" "+emp.getValue()));
			// Stream.of(employeeGroupByDepart).forEach(System.out::println);

			for (Map.Entry<String, List<EmployeeBean>> empJobTitle : employeeGroupByJobTitle.entrySet()) {
				System.out.println("================== JobTitle :: "+empJobTitle.getKey()+" ::=================="); 
				List<EmployeeBean> empList1 = empJobTitle.getValue();
				for (EmployeeBean employeeBean : empList1) {
				System.out.println(" "+employeeBean.getEmployeeId()+" "+employeeBean.getFirstName() +" "+employeeBean.getJobTitle());	
				}
			}
		}
	}
}
