package io.zipcoder.persistenceapp.service;

import io.zipcoder.persistenceapp.model.Employee;
import io.zipcoder.persistenceapp.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo){
        this.employeeRepo = employeeRepo;
    }

    public Iterable<Employee> index() {
        return employeeRepo.findAll();
    }

    public Employee show(Integer id) {
        return employeeRepo.findOne(id);
    }

    public Employee create(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Boolean delete (Integer id){
        employeeRepo.delete(id);
        return true;
    }
}
