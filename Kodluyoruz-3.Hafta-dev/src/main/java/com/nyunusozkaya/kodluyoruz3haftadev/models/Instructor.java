package com.nyunusozkaya.kodluyoruz3haftadev.models;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Instructor {
    private String name;
    private String address;
    private String phone;

    @OneToMany
    List<Course> courselist = new ArrayList<>();

    public List<Course> getCourseList() {
        return courselist;
    }

    private void setCourseInstructor(List<Course> courselist){
        for (Course course: courselist) {
            course.setInstructor(this);
        }
    }
    public void setCourseList(List<Course> courselist) {
        if(courselist.size()>0) this.courselist = courselist;
        setCourseInstructor(courselist);
    }

    public Instructor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Instructor)) return false;
        Instructor that = (Instructor) o;
        return getPhone().equals(that.getPhone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPhone());
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
