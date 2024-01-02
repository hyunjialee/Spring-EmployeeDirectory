package io.zipcoder.persistenceapp.controller;


import io.zipcoder.persistenceapp.model.Employee;
import io.zipcoder.persistenceapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    @PostMapping("/employee")
    public ResponseEntity<Employee> create(@RequestBody Employee employee) {
        return new ResponseEntity<>(employeeService.create(employee), HttpStatus.CREATED);
    }

    @GetMapping("/employee")
    public ResponseEntity<Iterable<Employee>> index() {
        return new ResponseEntity<>(employeeService.index(), HttpStatus.OK);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> show(@PathVariable Integer id) {
        return new ResponseEntity<>(employeeService.show(id), HttpStatus.OK);
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<Boolean> deleteEmployee(@PathVariable Integer id) {
        return new ResponseEntity<>(employeeService.delete(id), HttpStatus.OK);
    }

}
