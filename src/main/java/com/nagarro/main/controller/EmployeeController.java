package com.nagarro.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.main.dao.EmployeeDao;
import com.nagarro.main.model.Employee;
import com.nagarro.main.model.EmployeeList;

//import com.nagarro.main.dao.EmployeeDao;
//import com.nagarro.main.model.Employee;



/**
 * Controller class for Api , It handles all end points of API
 * @author rahul04
 *
 */

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeDao dao;
	
	@GetMapping("/employees")
	public EmployeeList getEmp() {
		
		return new EmployeeList((List<Employee>) dao.findAll());
	}
	@GetMapping("/employee/{eid}")
	public Optional<Employee> addEmp(@PathVariable("eid") int eid) {
		return dao.findById(eid);
	}
	
	@PostMapping("/employee")
	public  Employee setEmp(@RequestBody  Employee employee) {
		dao.save(employee);
		return employee;
	}
	
	@DeleteMapping("/employee/{eid}")
	public String deleteEmp(@PathVariable int eid) {
		Employee employee = dao.getById(eid);
		dao.delete(employee);
		return "deleted";
	}
	
	@PutMapping("/employee")
	public  Employee updateEmp(@RequestBody  Employee employee) {
		dao.save(employee);
		return employee;
	}
	
}
