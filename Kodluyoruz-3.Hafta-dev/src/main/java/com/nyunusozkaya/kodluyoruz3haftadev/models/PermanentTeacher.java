package com.nyunusozkaya.kodluyoruz3haftadev.models;

public class PermanentTeacher extends Instructor{
    private double fsalary;

    public double getFsalary() {
        return fsalary;
    }

    public void setFsalary(double fsalary) {
        this.fsalary = fsalary;
    }

    public PermanentTeacher() {
    }

    public PermanentTeacher(double fsalary) {
        this.fsalary = fsalary;
    }

    @Override
    public String toString() {
        return "PermanentTeacher{" +
                "fsalary=" + fsalary +
                ", courselist=" + courselist +
                "} " + super.toString();
    }
}
