package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}
	
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	
	public Employee updateEmployee(Employee employee) { 
		return employeeRepository.save(employee);
	}
	
	public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }
	
	public boolean deleteEmployeeById(Long id) {
		if(employeeRepository.existsById(id)) {
			employeeRepository.deleteById(id);
			return true;
		}else {
			return false;
		}
	}
	
	
}
