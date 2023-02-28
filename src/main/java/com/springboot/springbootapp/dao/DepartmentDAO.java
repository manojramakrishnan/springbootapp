package com.springboot.springbootapp.dao;

import java.util.List;

import com.springboot.springbootapp.model.Department;

public interface DepartmentDAO {

	public void persistDepartment(Department department);

	public List<Department> getDepartments();

	public Department getDepartmentById(Long id);

	public void deleteDepartmentById(Long id);

	public Department getDepartmentByDepartmentName(String departmentName);

}
