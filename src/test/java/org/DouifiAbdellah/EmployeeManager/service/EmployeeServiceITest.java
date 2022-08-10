package org.DouifiAbdellah.EmployeeManager.service;

import org.DouifiAbdellah.EmployeeManager.model.Employee;
import org.DouifiAbdellah.EmployeeManager.repository.EmployeeRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
// this annotation replace the commented code
@ExtendWith(MockitoExtension.class)
class EmployeeServiceImplTest {

    @Mock
    private EmployeeRepository employeeRepository;
    private EmployeeServiceImpl underTest;
 //   AutoCloseable autoCloseable;


    @BeforeEach
    void setUp() {
    //     this.autoCloseable = MockitoAnnotations.openMocks(this);
        this.underTest = new EmployeeServiceImpl(employeeRepository);
    }

   /* @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }*/

    @Test
    void CanFindAllEmployee() {
        //when
        underTest.findAllEmployee();
        //then
        Mockito.verify(employeeRepository).findAll();
    }

    @Test
    @Disabled
    void findEmployeeById() {
    }


/*
    @Test
    void deleteEmployee() {
        //given
        Long idToChek =4L;
        //when
        underTest.deleteEmployee(idToChek);
        //then
        ArgumentCaptor<Employee> employeeArgumentCaptor= ArgumentCaptor.forClass(Employee.class);
        Mockito.verify(employeeRepository).deleteEmployeeById(employeeArgumentCaptor.capture());
        Employee capturedEmployee = employeeArgumentCaptor.getValue();


        Mockito.verify(employeeRepository).deleteEmployeeById(idToChek);
        Assertions.assertThat(capturedEmployee).isEqualTo(employee);

    }
*/

    @Test
    void CanAddEmployee() {
        //given
        Employee employee = new Employee(
                "Samuels Etoo",
                "etoo.samuels@gmail.com",
                "Correpted",
                "0XX9890634",
                "https://www.bootdey.com/img/Content/avatar/avatar3.jpg");
        // when
        underTest.AddEmployee(employee);
        //then
        ArgumentCaptor<Employee> employeeArgumentCaptor= ArgumentCaptor.forClass(Employee.class);
        Mockito.verify(employeeRepository).save(employeeArgumentCaptor.capture());
        Employee capturedEmployee = employeeArgumentCaptor.getValue();

        Assertions.assertThat(capturedEmployee).isEqualTo(employee);


    }
}