package io.zipcoder.persistenceapp.service;


import io.zipcoder.persistenceapp.model.Department;
import io.zipcoder.persistenceapp.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    private DepartmentRepo departmentRepo;

    @Autowired
    public DepartmentService(DepartmentRepo departmentRepo){
        this.departmentRepo = departmentRepo;
    }

    public Iterable<Department> index() {
        return departmentRepo.findAll();
    }

    public Department show(Integer id) {
        return departmentRepo.findOne(id);
    }

    public Department create(Department department) {
        return departmentRepo.save(department);
    }

    public boolean delete(Integer id){
        departmentRepo.delete(id);
        return true;
    }
}
