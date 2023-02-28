package com.springboot.springbootapp.service;

import java.util.List;

import com.springboot.springbootapp.model.Department;

public interface DepartmentService {

	public void saveDepartment(Department department);

	public List<Department> fetchDepartments();

	public Department fetchDepartmentById(Long id);

	public void deleteDepartmentById(Long id);

	public Department updateDepartmentById(Long id, Department dept);

	public Department fetchDepartmentByDepartmentName(String departmentName);

}
