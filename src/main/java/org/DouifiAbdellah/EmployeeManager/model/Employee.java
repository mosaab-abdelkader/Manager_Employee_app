package org.DouifiAbdellah.EmployeeManager.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Employee  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String Phone;
    private String imgUrl;
    @Column(nullable = false,updatable = false)
    private String employeeCode;

    public Employee(String name, String email, String jobTitle, String phone, String imgUrl) {
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.Phone = phone;
        this.imgUrl = imgUrl;
    }
}
