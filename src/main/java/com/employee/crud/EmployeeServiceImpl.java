package com.employee.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		
		return employeeRepository.findById(id).get();
	}

	@Override
	public void deleteEmployeeById(Long id) {

		employeeRepository.deleteById(id);
	}

	@Override
	public Employee updatEmployee(Employee employee, Long id) {
		
		Employee u = employeeRepository.findById(id).get();
		u.setId(employee.getId());
		u.setName(employee.getName());
		u.setEmail(employee.getEmail());
		u.setSalary(employee.getSalary());
		
		return  employeeRepository.save(u);	
	}

}
