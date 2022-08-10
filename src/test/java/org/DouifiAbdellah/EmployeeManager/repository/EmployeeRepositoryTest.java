package org.DouifiAbdellah.EmployeeManager.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository underTest;
    @Test
    void checkIfMethodExistsByIdWork() {
        //given
/*
        Employee employee = new Employee(
                "Samuels Etoo",
                 "etoo.samuels@gmail.com",
                "Correpted",
                "0XX9890634",
                "https://www.bootdey.com/img/Content/avatar/avatar3.jpg");
        Long id = employee.getId();

        underTest.save(employee);
        Long idToCheck = employee.getId();*/
        //when
        boolean expected = underTest.existsById(2L);
        //then
        Assertions.assertThat(expected).isTrue();
    }
}