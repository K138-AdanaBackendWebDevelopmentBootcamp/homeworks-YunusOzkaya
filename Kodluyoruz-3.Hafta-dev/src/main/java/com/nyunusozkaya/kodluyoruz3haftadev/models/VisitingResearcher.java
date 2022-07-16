package com.nyunusozkaya.kodluyoruz3haftadev.models;

public class VisitingResearcher extends Instructor{
    private double hsalary;

    public VisitingResearcher() {
    }

    public double getHsalary() {
        return hsalary;
    }

    public void setHsalary(double hsalary) {
        this.hsalary = hsalary;
    }

    @Override
    public String toString() {
        return "VisitingResearcher{" +
                "hsalary=" + hsalary +
                ", courselist=" + courselist +
                "} " + super.toString();
    }
}
