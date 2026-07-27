package com.sub.employee5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({
    @PropertySource("classpath:com/sub/employee5/employee1.properties"),
    @PropertySource("classpath:com/sub/employee5/employee2.properties")
})

public class AppConfig {

	private final Environment env;

	public AppConfig(Environment env) {
		this.env = env;
	}

	@Bean
	public Employee employee() {

		Employee emp = new Employee();

		emp.setName(env.getProperty("employee.name"));
		emp.setDepartment(env.getProperty("employee.department"));
		emp.setEmpId(Integer.parseInt(env.getProperty("employee.empId")));
		emp.setSalary(Integer.parseInt(env.getProperty("employee.salary")));
		emp.setExperience(Integer.parseInt(env.getProperty("employee.experience")));

		return emp;
	}
}
