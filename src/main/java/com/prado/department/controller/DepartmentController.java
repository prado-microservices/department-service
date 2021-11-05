package com.prado.department.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prado.department.entity.Department;
import com.prado.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/save")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("Saving Department: " + department);
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/fetch/{id}")
	public Department findDepatment(@PathVariable("id") Long departmentId) {
		log.info("fetching department: " + departmentId);
		return departmentService.findDepartment(departmentId);
	}
	
}
