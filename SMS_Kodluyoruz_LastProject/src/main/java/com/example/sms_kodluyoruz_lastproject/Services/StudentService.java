package com.example.sms_kodluyoruz_lastproject.Services;

import com.example.sms_kodluyoruz_lastproject.Models.Student;
import com.example.sms_kodluyoruz_lastproject.Repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    final StudentRepository studentRepository;

    @Transactional(readOnly = true)
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        Iterable<Student> studentIterable = studentRepository.findAll();
        studentIterable.iterator().forEachRemaining(students::add);
        return students;
    }

    @Transactional
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Transactional(readOnly = true)
    public Student findById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Transactional
    public Student update(Student student) {
        return studentRepository.save(student);
    }

    @Transactional
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    public Student findByName(String name) {
        return studentRepository.findByName(name);
    }

    public void deleteByName(String name) {
        studentRepository.deleteByName(name);
    }
}
