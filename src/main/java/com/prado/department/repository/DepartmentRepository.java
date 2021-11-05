package com.prado.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prado.department.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

	Department findByDepartmentId(Long departmentId);
	
}
