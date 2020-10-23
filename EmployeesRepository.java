package com.sw409.Employees.controllers.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.sw409.Employees.Employees;

public interface EmployeesRepository extends CrudRepository<Employees, Integer>{

}
