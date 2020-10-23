package com.sw409.Employees.services;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw409.Employees.Employees;
import com.sw409.Employees.controllers.Repositories.EmployeesRepository;

@Service
public class EmployeesService {
	List<Employees>employeesList = new ArrayList<>();
	@Autowired
	EmployeesRepository employeesRespository;
	
	public Employees createEmployees(Employees employees) {
		employeesList.add(employees);
		return employees;
	}
	public List<Employees>findAllEmployees(){
		return (List<Employees>) (employeesRespository.findAll());
	}
	



	//update
	public void updateEmployees(Integer emp_id, Employees e){
		for(int i = 0; i <employeesList.size(); i++) {
			if(employeesList.get(i).getEmp_id().equals(emp_id)){
				employeesList.set(i, e);
			}
		}
	}

	//Delete
	public void deleteEmployees(Integer emp_id, Employees employees) {


	}

	
	
	}


