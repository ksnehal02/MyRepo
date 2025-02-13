package com.cg.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Employee;
import com.cg.exception.ResourceNotFoundException;
import com.cg.service.EmployeeService;

@RestController
@RequestMapping("/eapi")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/hello")
	public String greet() {
		return "Hello SpringRest!";
	}

	@GetMapping(path = "/employees")
	public List<Employee> getAllEmployees() {
		return employeeService.findAllEmployees();

	}
}