package org.DouifiAbdellah.EmployeeManager.service;

import org.DouifiAbdellah.EmployeeManager.exception.UserNotFoundException;
import org.DouifiAbdellah.EmployeeManager.model.Employee;
import org.DouifiAbdellah.EmployeeManager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.UUID;
@CrossOrigin("*")
@Service
public class EmployeeServiceImpl implements EmployeeServices{

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee AddEmployee(Employee employee){

        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }
    public List<Employee> findAllEmployee(){
        return employeeRepository.findAll();
    }
    public Employee updateEmployee (Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee findEmployeeById(Long id)  {
        return employeeRepository.findEmployeeById(id).orElseThrow(()->new UserNotFoundException("User by id :"+id+"was not found"));
    }

    public void deleteEmployee (Long id){
        employeeRepository.deleteEmployeeById(id);
    }

    public boolean existsById(Long aLong){
       return employeeRepository.existsById(aLong);
    }
}
