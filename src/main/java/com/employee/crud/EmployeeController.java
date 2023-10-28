package com.employee.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.bytebuddy.asm.Advice.Return;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	
	//List of Employees Data
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		
		return employeeService.getEmployees();
		
	}
	
	//Create Employees Data
	@PostMapping("/create/employees")
	public Employee createEmployee (@RequestBody Employee employee) {
		
		return employeeService.createEmployee(employee);
	}
	
	
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
		
		return employeeService.getEmployeeById(id);
		
	}
	
	//Delete Emploees Data
	@DeleteMapping("/delete/employees/{id}")
	public void deleteEmployeeById(@PathVariable Long id) {
		
		employeeService.deleteEmployeeById(id);
	}
	
	
	//Update Employees Data
	@PutMapping("/update/employees/{id}")
	public Employee updatEmployee (@RequestBody Employee employee , @PathVariable("id") Long id) {
	
	return employeeService.updatEmployee(employee, id);
	}
}
