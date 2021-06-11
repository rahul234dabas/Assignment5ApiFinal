package com.nagarro.main.model;

import java.util.List;


/**
 * this class contains list of type Employee
 * @author rahul04
 *
 */
public class EmployeeList {
	
	
	List<Employee> list;
	
	
	
	

	public EmployeeList() {
		
	}

	public EmployeeList(List<Employee> list) {
		super();
		this.list = list;
	}

	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}
	
	

}
