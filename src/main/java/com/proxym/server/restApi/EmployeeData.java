package com.proxym.server.restApi;


import com.proxym.server.restApi.model.Employee;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {


    public static List<Employee> employees = new ArrayList<>();

    static {
        // Add mock data to the employees list
        employees.add(new Employee(1, "John Doe", "manager", 50000));
        employees.add(new Employee(2, "Jane Doe", "technician", 60000));
        employees.add(new Employee(3, "Bob Smith", "developer", 40000));
    }


    public static List<Employee> getEmployees() {
        return employees;
    }

    public static Employee getEmployeeById(int id) {
        // Search for an employee with the given ID
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }return null;
    }
}

