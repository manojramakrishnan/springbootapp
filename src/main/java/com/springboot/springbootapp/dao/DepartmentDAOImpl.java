package com.springboot.springbootapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.springbootapp.model.Department;
import com.springboot.springbootapp.repository.DepartmentRepository;

@Component
public class DepartmentDAOImpl implements DepartmentDAO{
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public void persistDepartment(Department department) {
		
		departmentRepository.save(department);
	}

	@Override
	public List<Department> getDepartments() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

	@Override
	public Department getDepartmentById(Long id) {
		Department dept = departmentRepository.findById(id).get();
		return dept;
	}

	@Override
	public void deleteDepartmentById(Long id) {
		departmentRepository.deleteById(id);
		
	}

	@Override
	public Department getDepartmentByDepartmentName(String departmentName) {
		// TODO Auto-generated method stub
		return departmentRepository.findByDepartmentName(departmentName);
	}

}
