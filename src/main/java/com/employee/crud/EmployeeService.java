package com.employee.crud;

import java.util.List;

public interface EmployeeService {
	
	List<Employee> getEmployees();
	
	Employee createEmployee (Employee employee);
	
	Employee getEmployeeById(Long id);
	
	Employee updatEmployee (Employee employee , Long id);
	
	void deleteEmployeeById(Long id);

}
