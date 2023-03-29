package com.proxym.server.restApi;

import com.proxym.server.restApi.model.Employee;
import com.proxym.server.restApi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class RestApiApplication  implements CommandLineRunner {
@Autowired
EmployeeService es;
	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
	    Employee employee = es.getEmpolyeeById(2);
        System.out.println("Employee:  " + employee.toString());
    }
}


