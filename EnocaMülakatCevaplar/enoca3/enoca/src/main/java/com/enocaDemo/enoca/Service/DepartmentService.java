package com.enocaDemo.enoca.Service;

import com.enocaDemo.enoca.DAO.Department;
import com.enocaDemo.enoca.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }

    public Department getDepartmentById(long depertmentId) {
        return departmentRepository.findById(depertmentId).get();
    }

    public Department updateDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public void deleteDepartment(long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

}
