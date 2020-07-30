package io.hcl.springbootstarter.employee2;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private List<Employee> id =  Arrays.asList(
			new Employee(1,"shashi",500000000),
			new Employee(2,"Ameet",400000000),
			new Employee(1,"Poulami",100000000));
	
	public List<Employee> getAllId(){
		return id;
	}
	
	
}

