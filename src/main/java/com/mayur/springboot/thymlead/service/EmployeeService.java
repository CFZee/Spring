package com.mayur.springboot.thymlead.service;

import java.util.List;

import com.mayur.springboot.thymlead.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
