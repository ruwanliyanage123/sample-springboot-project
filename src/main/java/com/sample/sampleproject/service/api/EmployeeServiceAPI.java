package com.sample.sampleproject.service.api;

import com.sample.sampleproject.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeServiceAPI {
    public abstract List<Employee> getAllEmployee();
    public abstract void deleteEmployee(Long empId);
    public abstract void addEmployee(Employee employee);
}
