package com.enocaDemo.enoca.Controls;

import com.enocaDemo.enoca.DAO.Student;
import com.enocaDemo.enoca.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentControls {

    @Autowired
    StudentService studentService;

    @PostMapping("/save") //yeni bir öğrenci kaydı oluşturacağız.
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        Student saveStudent = studentService.saveStudent(student);
        return new ResponseEntity<>(saveStudent, HttpStatus.CREATED);
    }

    @GetMapping("/all") //Sunucudan veri almak için kullanılacak yöntemdir.
    public ResponseEntity<List<Student>> getAllStudent() {
        List<Student> allStudent = studentService.getAllStudent();
        return new ResponseEntity<List<Student>>(allStudent, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getAllStudentById(@PathVariable(name = "id") int studentId) {
        Student student = studentService.getStudentById(studentId);
        return new ResponseEntity<Student>(student, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}") //Sunucudaki belirli bir kaynağı güncellemek için kullanılır.
    public ResponseEntity<Student> updateStudentById(@RequestBody Student student) {
        Student updateStudent = studentService.updateStudent(student);
        return new ResponseEntity<Student>(updateStudent, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}") //Sunucudaki veriyi silmek için kullanılır.
    public ResponseEntity<Void> deleteStudentId(@PathVariable(name = "id") int studentId) {
        studentService.deleteStudentById(studentId);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

}
