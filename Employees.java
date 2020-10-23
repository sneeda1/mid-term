package com.sw409.Employees;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity(name = "employees")
public class Employees {
	String emp_name;
	String emp_title;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer emp_id;
	
	
	
	
	
	
	
	
	
	
	
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_title() {
		return emp_title;
	}
	public void setEmp_title(String emp_title) {
		this.emp_title = emp_title;
	}
	public Integer getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}
	public Employees(String emp_name, String emp_title, Integer emp_id) {
		super();
		this.emp_name = emp_name;
		this.emp_title = emp_title;
		this.emp_id = emp_id;
	}
	public Employees() {
		
		// TODO Auto-generated constructor stub
	}
	
	

}
