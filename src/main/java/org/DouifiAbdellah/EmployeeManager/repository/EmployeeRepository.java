package org.DouifiAbdellah.EmployeeManager.repository;

import org.DouifiAbdellah.EmployeeManager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    void deleteEmployeeById (Long id);

    //Employee findEmployeeById(Long id);
    //optional evit le cas d'un id erroné
    Optional<Employee> findEmployeeById(Long id);


}
