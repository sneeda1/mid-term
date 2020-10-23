package com.sw409.Employees.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.Employees.Employees;
import com.sw409.Employees.services.EmployeesService;

@RestController
@CrossOrigin("*")
public class EmployeesController {
 @Autowired
EmployeesService empService;
//create
@PostMapping("api/v1/employees")
public Employees createEmployees(@RequestBody Employees employees) {
	return empService.createEmployees(employees);
}
//Read
@GetMapping("api/v1/employees")
public List<Employees> findAllEmployees()
{
	return empService.findAllEmployees();
	
}
//Update
@PutMapping("api/v1/employees/{emp_id}")
public void updateEmpolyees(@PathVariable("emp_id")Integer emp_id, @RequestBody Employees employees)
{
	empService.updateEmployees(emp_id, employees);
}
//Delete
@DeleteMapping("api/v1/employees/{emp_id}")
public void deleteEmployees(@PathVariable("emp_id")Integer emp_id, @RequestBody Employees employees)
{
	empService.deleteEmployees(emp_id,employees);
}
}