package com.example.sms_kodluyoruz_lastproject.Repositories;

import com.example.sms_kodluyoruz_lastproject.Models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    Student findByName(String name);
    int deleteByName(String name);
}