package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Department;
import com.cg.repository.DepartmentRepository;

@Service
public class DepartmentService implements IDepartmentService{

	@Autowired
	DepartmentRepository departmentRepository;
	
	List<Department> departmentList=new ArrayList<>();
	
	@Override
	public List<Department> findAllDepartments() {
		return departmentRepository.findAll();
	}

}
