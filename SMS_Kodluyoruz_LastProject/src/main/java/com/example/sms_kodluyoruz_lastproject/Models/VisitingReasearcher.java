package com.example.sms_kodluyoruz_lastproject.Models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@Entity
public class VisitingReasearcher extends Instructor {
    private double hourlySalary;

    private static final int HOUR_MULTIPLY_MONTH = 8 * 30;
    public VisitingReasearcher(double hourlySalary) {
        this.hourlySalary = hourlySalary;
        setSalary(hourlySalary* HOUR_MULTIPLY_MONTH);
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
        setSalary(hourlySalary*HOUR_MULTIPLY_MONTH);
    }
}