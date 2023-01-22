package com.enocaDemo.enoca.Repository;

import com.enocaDemo.enoca.DAO.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
