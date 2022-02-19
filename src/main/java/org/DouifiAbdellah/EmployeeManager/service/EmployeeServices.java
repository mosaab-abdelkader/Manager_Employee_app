package org.DouifiAbdellah.EmployeeManager.service;

import org.DouifiAbdellah.EmployeeManager.exception.UserNotFoundException;
import org.DouifiAbdellah.EmployeeManager.model.Employee;

import java.util.List;
import java.util.UUID;

public interface EmployeeServices {

    public Employee AddEmployee(Employee employee);
    public List<Employee> findAllEmployee();
    public Employee updateEmployee (Employee employee);
    public Employee findEmployeeById(Long id) ;
    public void deleteEmployee (Long id);
}
