package com.enocaDemo.enoca.Service;

import com.enocaDemo.enoca.DAO.Department;
import com.enocaDemo.enoca.DAO.Student;
import com.enocaDemo.enoca.Repository.DepartmentRepository;
import com.enocaDemo.enoca.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired // bir bean içerisindeki değerleri başka beanin içerisine enjekte edebilir değerlerini koruyarak kullanabiliriz.
    StudentRepository studentRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }  //find() Belirtilen desende tüm eşleşmeleri içeren bir liste verir.

    public Student saveStudent(Student student) {
        Department department = departmentRepository.findById(student.getDepartment().getDepartmentId()).orElse(null);
        student.setDepartment(department);
        return studentRepository.save(student);
    }

    public Student getStudentById(long studentId) {
        return studentRepository.findById(studentId).get();
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudentById(long studentId) {
        studentRepository.deleteById(studentId);
    }

}
