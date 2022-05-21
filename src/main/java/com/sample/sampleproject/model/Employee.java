package com.sample.sampleproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long empId;

    @NotBlank(message = "Name is mandatory")
    private String employeeName;

    @NotBlank(message = "Age is mandatory")
    private String employeeAge;

    public Employee(long empId, String employeeName, String employeeAge) {
        this.empId = empId;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
    }

    public Employee() {

    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(String employeeAge) {
        this.employeeAge = employeeAge;
    }
}
