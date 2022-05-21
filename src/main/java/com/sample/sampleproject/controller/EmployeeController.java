package com.sample.sampleproject.controller;

import com.sample.sampleproject.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @PostMapping("/")
    public void addEmployee(){
        //add post method
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return null;
    }

    @GetMapping("/employees/{id}")
    public List<Employee> getAllEmployees(@PathVariable long empId){
        return null;
    }

    @DeleteMapping("/")
    public void deleteEmployee(){

    }
}
