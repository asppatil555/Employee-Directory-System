package com.emp.controller;

import com.emp.entity.Employee;
import com.emp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/add")
   public ResponseEntity<String> addEmployee(@RequestBody Employee employee){
       System.err.println(employee);
       employeeService.savdEmployee(employee);
       return new ResponseEntity<>("Data save successfully", HttpStatus.OK);
   }

   @GetMapping("/getAll")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee> employeeList=employeeService.employeeList();
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
   }

   @GetMapping("/getById/{id}")
    public ResponseEntity<Employee> getById(@PathVariable("id") int id){
        Employee employee=employeeService.getEmployeeByid(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
   }


}
