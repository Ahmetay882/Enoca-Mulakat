package com.enocaDemo.enoca.Controls;

import com.enocaDemo.enoca.DAO.Department;
import com.enocaDemo.enoca.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/department")
public class DeparmentControls {

    @Autowired
    DepartmentService departmentService;


    @PostMapping("/save")
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department) {
        Department saveDepartment = departmentService.saveDepartment(department);
        return new ResponseEntity<Department>(saveDepartment, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Department>> getAllDepartment() {
        List<Department> allDepartment = departmentService.getAllDepartment();
        return new ResponseEntity<List<Department>>(allDepartment, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable(name = "id") int departmentId) {
        Department department = departmentService.getDepartmentById(departmentId);
        return new ResponseEntity<Department>(department, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Department> updateDepartmentId(@RequestBody Department department) {
        Department updateDepartment = departmentService.updateDepartment(department);
        return new ResponseEntity<Department>(updateDepartment, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteDepartmentById(@PathVariable(name = "id") int departmentId) {
        departmentService.deleteDepartment(departmentId);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

}
