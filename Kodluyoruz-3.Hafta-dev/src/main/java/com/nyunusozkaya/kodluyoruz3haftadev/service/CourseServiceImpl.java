package com.nyunusozkaya.kodluyoruz3haftadev.service;

import com.nyunusozkaya.kodluyoruz3haftadev.models.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl {
    private final CourseDAO<Course> iCourseDAO;

    public CourseServiceImpl(ICourseDAO<Course> iCourseDAO) {
        this.CourseDAO = iCourseDAO;
    }

    @Override
    public List<Course> findAll() {
        return CourseDAO.findAll();
    }

    @Override
    public Course findById(int id) {
        return CourseDAO.findById(id);
    }

    @Override
    public Course save(Course course) {
        return CourseDAO.save(course);
    }

    @Override
    public void deleteById(int id) {
        CourseDAO.deleteById(id);
    }

    public void deleteByCode(String code){CourseDAO.deleteByCode(code);}

    @Override
    public Course update(Course course, int id) {
        return CourseDAO.update(course,id);
    }

    public Course updateByCode(Course course, String code){return CourseDAO.updateByCode(course,code);}
}
