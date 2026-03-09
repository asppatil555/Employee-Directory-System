package com.emp.service;

import com.emp.entity.Employee;

import java.util.List;

public interface EmployeeService {

    String savdEmployee(Employee employee);

    List<Employee> employeeList();

    Employee getEmployeeByid(int id);
}
