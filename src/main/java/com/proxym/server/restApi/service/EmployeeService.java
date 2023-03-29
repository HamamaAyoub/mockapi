package com.proxym.server.restApi.service;

import com.proxym.server.restApi.EmployeeData;
import com.proxym.server.restApi.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeService {

    public List<Employee> getEmployees() {
        // Use the EmployeeData class to get the mock data
        return EmployeeData.getEmployees();
    }
    public Employee getEmpolyeeById(int id){
        return EmployeeData.getEmployeeById(id);
}



}
