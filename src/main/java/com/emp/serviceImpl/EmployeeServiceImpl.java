package com.emp.serviceImpl;

import com.emp.entity.Employee;
import com.emp.repository.EmployeeRepository;
import com.emp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;



    @Override
    public String savdEmployee(Employee employee) {
        Employee saveEmployee= employeeRepository.save(employee);

        return "Data saved";
    }

    @Override
    public List<Employee> employeeList() {
        List<Employee> employeeList=employeeRepository.findAll();

        return employeeList;
    }

    @Override
    public Employee getEmployeeByid(int id) {
        Employee employee=employeeRepository.findById(id).orElseThrow(()->new NullPointerException("Employee with id not found"+id));


        return employee;
    }
}
