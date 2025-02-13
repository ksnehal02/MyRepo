package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Employee;
import com.cg.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	List<Employee> employeeList=new ArrayList<>();
	
	@Override
	public List<Employee> findAllEmployees() {
		return employeeRepository.findAll();
	}

}
