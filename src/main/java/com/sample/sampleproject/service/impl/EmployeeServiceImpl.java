package com.sample.sampleproject.service.impl;

import com.sample.sampleproject.dao.EmployeeDAO;
import com.sample.sampleproject.model.Employee;
import com.sample.sampleproject.service.api.EmployeeServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeServiceAPI {
    @Autowired
    EmployeeDAO employeeDAO;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeDAO.findAll();
    }

    @Override
    public void deleteEmployee(Long empId) {
        employeeDAO.deleteById(empId);
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeDAO.save(employee);
    }
}
