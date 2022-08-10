package org.DouifiAbdellah.EmployeeManager.controller;

import org.DouifiAbdellah.EmployeeManager.model.Employee;
import org.DouifiAbdellah.EmployeeManager.service.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.springframework.util.MimeTypeUtils.IMAGE_PNG_VALUE;


//@CrossOrigin(origins = {"http://localhost:4200","http://randim-dev.itn.intraorange:8080/"} )
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeServices employeeServices;

    @Autowired
    public EmployeeController(EmployeeServices employeeServices) {
        this.employeeServices = employeeServices;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> employees = employeeServices.findAllEmployee();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
    @GetMapping(path = "/getImg/{fileName}",produces = IMAGE_PNG_VALUE)
    public byte[]  getEmployeeImg(@PathVariable("fileName") String filename) throws IOException {
        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/data/imges/"+filename));
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id")Long id){
        Employee employee = employeeServices.findEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
    @GetMapping("/test/{id}")
    public Boolean testIfExist(@PathVariable("id")Long id){
        return employeeServices.existsById(id);
    }
    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee newEmployee = employeeServices.AddEmployee(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED );
    }

    @PutMapping("/update")
    public ResponseEntity<Employee>  updateEmployee(@RequestBody Employee employee){
        Employee newEmployee = employeeServices.updateEmployee(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.OK );
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>  deleteEmployee(@PathVariable("id")Long id){
       employeeServices.deleteEmployee( id);
        return new ResponseEntity<>( HttpStatus.OK );
    }
}
