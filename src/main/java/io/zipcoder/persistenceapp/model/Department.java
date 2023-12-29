package io.zipcoder.persistenceapp.model;

import javax.persistence.Entity;

@Entity
public class Department {
    private int departmentNumber;
    private String departmentName;
    private String manager;
}
