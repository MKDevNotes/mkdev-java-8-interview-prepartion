package com.mkdev.java8.lamda.streams.terminal.operation;

import static java.util.stream.Collectors.groupingBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.mkdev.java8.employee.repository.EmployeeRepository;
import com.mkdev.java8.employee.repository.model.EmployeeBean;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
public class StreamGroupingDifferentLevelExample {
	public static void main(String[] args) {

		// Single Level Grouping..
		Map<String, List<EmployeeBean>> singleGrouping = EmployeeRepository.getAllEmployeeDetails().stream()
				.collect(Collectors.groupingBy(EmployeeBean::getDepartment));
		System.out.println(" SingleGrouping Department "+singleGrouping.get("Product"));

		/*
		 Map<String, List<EmployeeBean>> singleGroupingFilter = EmployeeRepository.getAllEmployeeDetails().stream()
				.filter(emp -> emp.getDepartment().equalsIgnoreCase("Product"))
				.collect(Collectors.groupingBy(EmployeeBean::getDepartment));
		
		for(Entry<String, List<EmployeeBean>> singleEntry : singleGroupingFilter.entrySet()) {
			System.out.println("SingleEntry"+singleEntry.getKey());
			singleEntry.getValue().stream().forEach(emp -> System.out.println(emp.getFirstName()+" "+emp.getDepartment()));
		}
		*/
		
		// two Level Grouping..
		Map<String,Map<String, List<EmployeeBean>>> towlevelGrouping = EmployeeRepository.getAllEmployeeDetails().stream()
						.collect(Collectors.groupingBy(EmployeeBean::getDepartment,groupingBy(EmployeeBean::getJobTitle)));
	
		System.out.println(" TwoGrouping Department and  Mobile Developer "+towlevelGrouping.get("Product").get("Mobile Developer").size());
		
		
		Map<String, Map<String, Map<String, List<EmployeeBean>>>> threeLevelGrouping = EmployeeRepository
																						.getAllEmployeeDetails()
																						.stream()
																						.collect(groupingBy(EmployeeBean::getGender, groupByDepartAndJobTitle()));
		
		/*
		 *  This implement will todo...
		 *  
		 * for(Entry<String, Map<String, Map<String, List<EmployeeBean>>>> threeLevel : threeLevelGrouping.entrySet()) {
			
			//threeLevel.getValue().get(threeLevel.getKey()).
			
			Map<String,Map<String, List<EmployeeBean>>> twoGroup = threeLevel.getValue();
			
			for(Entry<String, Map<String, List<EmployeeBean>>>  mapVal : twoGroup.entrySet()) {
				
			}
			
		} */
		
		System.out.println(" Three Field Grouping  : "+threeLevelGrouping);
		
		
		
	}
	
	

	
	private static Collector<EmployeeBean, ?, Map<String, Map<String, List<EmployeeBean>>>> groupByDepartAndJobTitle() {
	    return groupingBy(EmployeeBean::getDepartment, groupingBy(EmployeeBean :: getJobTitle));
	}
}
