package com.org.pro.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class EmployeeModel {
    @Id
    private int employeeId;
    private String employeeName;
    private double employeeSalary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeesalary() {
        return employeeSalary;
    }

    public void setEmployeesalary(double employeesalary) {
        this.employeeSalary = employeesalary;
    }
}
