package com.nyunusozkaya.kodluyoruz3haftadev.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;
import java.util.Objects;

@Entity
public class Course {
    private String cname;
    private long ccode;
    private long cscore;

    @ManyToOne
    private Instructor instructor;
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    @ManyToMany
    private List<Student> studentlist;

    public void setStudentlist(List<Student> studentlist) {
        this.studentlist = studentlist;
    }

    public List<Student> getStudentlist() {
        return studentlist;
    }

    public void setStudent(Student student) {
        this.studentlist.add(student);
        student.getCourselist().add(this);
    }


    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }


    public long getCcode() {
        return ccode;
    }

    public void setCcode(long ccode) {
        this.ccode = ccode;
    }

    public long getCscore() {
        return cscore;
    }

    public void setCscore(long cscore) {
        this.cscore = cscore;
    }

    public Course() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return getCcode() == course.getCcode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCcode());
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                ", ccode=" + ccode +
                ", cscore=" + cscore +
                '}';
    }
}
