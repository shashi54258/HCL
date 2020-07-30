package io.hcl.springbootstarter.employee1;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee1Controller {

	@RequestMapping("/hello")
	public String helloEmployee() {
		return "Hello";
}
}
