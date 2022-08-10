package org.DouifiAbdellah.EmployeeManager.service;

import org.DouifiAbdellah.EmployeeManager.model.Employee;

import java.util.List;

public interface EmployeeServices {

    public Employee AddEmployee(Employee employee);
    public List<Employee> findAllEmployee();
    public Employee updateEmployee (Employee employee);
    public Employee findEmployeeById(Long id) ;
    public void deleteEmployee (Long id);
    public boolean existsById(Long aLong);
}
