package com.sample.sampleproject.controller;

import com.sample.sampleproject.model.Employee;
import com.sample.sampleproject.service.api.EmployeeServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeServiceAPI employeeService;

    @PostMapping("/")
    public void addEmployee(Employee employee){
        employeeService.addEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployee();
    }

    @DeleteMapping("/")
    public void deleteEmployee(Long empId){
        employeeService.deleteEmployee(empId);
    }
}
