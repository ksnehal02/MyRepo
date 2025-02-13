package com.cg.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Department;
import com.cg.exception.ResourceNotFoundException;
import com.cg.feign.DepartmentFeignClient;
import com.cg.service.DepartmentService;

@RestController
@RequestMapping("/dapi")
public class DepartmentController {
	@Autowired
	DepartmentService departmentService;
	@Autowired
	DepartmentFeignClient departmentFeignClient;

	@GetMapping("/hello")
	public String greet() {
		return "Hello SpringRest!";
	}

	@GetMapping(path = "/departments")
	public List<Department> getAllDepartments() {
		return departmentService.findAllDepartments();

	}
	
	@GetMapping("/allemp")
	public ResponseEntity<String> getEmployees(){
		return ResponseEntity.ok().body(departmentFeignClient.employeeResponce());
	}
}