package com.mayur.springboot.thymlead.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mayur.springboot.thymlead.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public List<Employee> findAllByOrderByLastNameAsc();
	
}
