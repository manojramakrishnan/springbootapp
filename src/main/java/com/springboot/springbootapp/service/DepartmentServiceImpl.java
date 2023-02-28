package com.springboot.springbootapp.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springbootapp.dao.DepartmentDAO;
import com.springboot.springbootapp.model.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDAO departmentDAO;
	
	@Override
	public void saveDepartment(Department department) {

		departmentDAO.persistDepartment(department);
		
	}

	@Override
	public List<Department> fetchDepartments() {
		// TODO Auto-generated method stub
		return departmentDAO.getDepartments();
	}

	@Override
	public Department fetchDepartmentById(Long id) {
		// TODO Auto-generated method stub
		return departmentDAO.getDepartmentById(id);
	}

	@Override
	public void deleteDepartmentById(Long id) {
		departmentDAO.deleteDepartmentById(id);
		
	}

	@Override
	public Department updateDepartmentById(Long id, Department department) {
		// TODO Auto-generated method stub
		Department dept = departmentDAO.getDepartmentById(id);
		if(Objects.nonNull(dept.getDepartmentName()) && !"".equalsIgnoreCase(dept.getDepartmentName())) {
			dept.setDepartmentName(department.getDepartmentName());
		}
		if(Objects.nonNull(dept.getDepartmentCode()) && !"".equalsIgnoreCase(dept.getDepartmentCode())) {
			dept.setDepartmentCode(department.getDepartmentCode());
		}
		departmentDAO.persistDepartment(dept);
		return dept;
	}

	@Override
	public Department fetchDepartmentByDepartmentName(String departmentName) {
		// TODO Auto-generated method stub
		return departmentDAO.getDepartmentByDepartmentName(departmentName);
	}

}
