package com.example.springboot_example.service;



import com.example.springboot_example.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);
    
    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
