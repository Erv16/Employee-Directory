package com.tracker.springboot.employee.service;

import com.tracker.springboot.employee.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();
    public Employee findById(int employeeId);
    public void save(Employee theEmployee);
    public void deleteById(int employeeId);
    public List<Employee> searchBy(String theName);
}
