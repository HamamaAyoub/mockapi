package com.proxym.server.restApi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    int id;
    String name;
    String jobName;
    double salary;

}
