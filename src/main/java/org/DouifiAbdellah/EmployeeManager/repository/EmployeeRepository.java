package org.DouifiAbdellah.EmployeeManager.repository;

import org.DouifiAbdellah.EmployeeManager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@CrossOrigin("*")
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    void deleteEmployeeById (Long id);

  /*  @Query("" +
            "SELECT COUNT(s)>0    " +

            "FROM Employee s " +
            "WHERE s.id = ?1"
    )*/
    boolean existsById(Long aLong);

    //Employee findEmployeeById(Long id);
    //optional evit le cas d'un id erroné
    Optional<Employee> findEmployeeById(Long id);


}
