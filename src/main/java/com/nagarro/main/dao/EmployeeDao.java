package com.nagarro.main.dao;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.main.model.Employee;
/**
 * this class extends JpaRepository to perform all CRUD operations
 * @author rahul04
 *
 */
@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	
	
}
