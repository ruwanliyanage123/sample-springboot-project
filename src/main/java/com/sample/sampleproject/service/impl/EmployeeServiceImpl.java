package com.sample.sampleproject.service.impl;

import com.sample.sampleproject.model.Employee;
import com.sample.sampleproject.service.api.EmployeeServiceAPI;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeServiceAPI {
    @Override
    public List<Employee> getAllEmployee() {
        return null;
    }

    @Override
    public void deleteEmployee() {

    }

    @Override
    public void addEmployee() {

    }
}
