package io.hcl.springbootstarter.employee2;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee2Controller {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/id")
	public List<Employee> getAllEmployeeid() {
		return employeeService.getAllId();
	}

}
