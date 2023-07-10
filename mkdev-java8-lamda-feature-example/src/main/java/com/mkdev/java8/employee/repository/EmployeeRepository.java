package com.mkdev.java8.employee.repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mkdev.java8.employee.repository.model.EmployeeBean;

/**
 *  @author Muthukumar Thangavinayagam
 *
 */
public class EmployeeRepository {

	/*
	 * public static void main(String[] args) throws JsonParseException,
	 * JsonMappingException, IOException { ObjectMapper mapper = new ObjectMapper();
	 * InputStream is = EmployeeBean.class.getResourceAsStream("/employees.json");
	 * 
	 * List<EmployeeBean> myObjects = mapper.readValue(is,
	 * mapper.getTypeFactory().constructCollectionType(List.class,
	 * EmployeeBean.class));
	 * 
	 * myObjects.stream().forEach(emp -> System.out.println(emp.getFirstName())); }
	 */

	 

	public static List<EmployeeBean> getAllEmployeeDetails() {
		List<EmployeeBean> employeeList = null;
		ObjectMapper mapper = new ObjectMapper();
		InputStream is = EmployeeBean.class.getResourceAsStream("/employees.json");

		try {
			employeeList = mapper.readValue(is,
						mapper.getTypeFactory().constructCollectionType(List.class, EmployeeBean.class));
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return employeeList;
	}

}
