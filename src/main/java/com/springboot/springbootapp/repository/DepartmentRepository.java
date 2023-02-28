package com.springboot.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springbootapp.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

	Department findByDepartmentName(String departmentName);

}
