package com.nyunusozkaya.kodluyoruz3haftadev.repository;

import com.nyunusozkaya.kodluyoruz3haftadev.models.Course;
import com.nyunusozkaya.kodluyoruz3haftadev.models.Student;

import java.util.List;

public interface StudentRepo {

        void deleteStudentWithId(int id);

        List<Course> getStudentCourseList(Student student);

    }
}
