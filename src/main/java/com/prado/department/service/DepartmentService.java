package com.prado.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prado.department.entity.Department;
import com.prado.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {
		log.info("Saving Department: " + department);
		return departmentRepository.save(department);
	}
	
	public Department findDepartment(Long departmentId) {
		log.info("fetching Department: " + departmentId);
		return departmentRepository.findByDepartmentId(departmentId);
	}
}
