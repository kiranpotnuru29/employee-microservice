package com.employee.serviceimpl;

import org.springframework.stereotype.Service;

import com.employee.domain.Employee;
import com.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public Employee getEmployee() {
		Employee employee = new Employee();
		employee.setId(1000);
		employee.setFirstName("kiran");
		employee.setLastName("potnuru");
		employee.setMiddleName("kumar");
		
		return employee;
	}

}
