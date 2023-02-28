package com.springboot.springbootapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springbootapp.model.Department;
import com.springboot.springbootapp.service.DepartmentService;

@RestController
public class Controller {
	
	private static Logger log = LoggerFactory.getLogger(Controller.class);
	
	@Autowired
	private DepartmentService departmentService;
	
//	@RequestMapping(name="/departments", method = RequestMethod.POST)
	@PostMapping("/departments")
	public void saveDepartment(@RequestBody @Valid Department department) {
		log.info("inside Controller:: saveDepartment()");
		 departmentService.saveDepartment(department);
	}
	
	@GetMapping("/departments")
	public List<Department> fetchDepartments(){
		return departmentService.fetchDepartments();
	}
	
	@GetMapping("/departments/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long id) {
		System.err.println("inside controller!!!");
		return departmentService.fetchDepartmentById(id);
	}
	@DeleteMapping("/departments/{id}")
	public void deleteDepartmentById(@PathVariable("id") Long id) {
		departmentService.deleteDepartmentById(id);
		
	}
	@PutMapping("/departments/{id}")
	public Department updateDepartmentById(@PathVariable("id") long id, @RequestBody Department department) {
		return departmentService.updateDepartmentById(id,department);
	}
	
	@GetMapping("/departments/name/{name}")
	public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
		return departmentService.fetchDepartmentByDepartmentName(departmentName);
	}

}
