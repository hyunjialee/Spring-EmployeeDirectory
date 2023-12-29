package io.zipcoder.persistenceapp.model;

import javax.persistence.Entity;

@Entity
public class Employee {

    private int employeeNumber;
    private String firstName;
    private String lastName;
    private String title;
    private int phoneNumber;
    private String email;
    private String date;
    private String manager;
    private int departmentNumber;

}
