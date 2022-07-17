package com.nyunusozkaya.kodluyoruz3haftadev.service;

public interface CourseService <Course> extends BaseService<Course> {

        void deleteByCode(String code);

        Course updateByCode(Course course, String code);
    }

