package com.enocaDemo.enoca.DAO;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "Department")
@Getter
@Setter
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private long departmentId;
    private String departmentName;
    private String departmentTeacher;

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentTeacher() {
        return departmentTeacher;
    }

    public void setDepartmentTeacher(String departmentTeacher) {
        this.departmentTeacher = departmentTeacher;
    }

}
