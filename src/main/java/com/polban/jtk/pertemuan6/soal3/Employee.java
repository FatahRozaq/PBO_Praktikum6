/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polban.jtk.pertemuan6.soal3;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author USER
 */
public class Employee extends Sortable {
    private String name;
    private double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;

    public Employee(String n, double s, int day, int month, int year) {
        name = n;
        salary = s;
        hireday = day;
        hiremonth = month;
        hireyear = year;
    }

    public void print() {
        System.out.println(name + " " + salary + " " + hireYear());
    }

    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100;
    }

    public int hireYear() {
        return hireyear;
    }

    @Override
    public int compare(Sortable b) {
        if (b instanceof Employee) {
            Employee eb = (Employee) b;
            if (this.compareSalary(eb) < 0) return -1;
            if (this.compareSalary(eb) > 0) return 1;
            return 0;
        }
        return 0; // Handle the case where 'b' is not an Employee, e.g., by returning 0.
    }

    protected double getSalary() {
        return salary;
    }

    private int compareSalary(Employee otherEmployee) {
        if (salary < otherEmployee.salary) return -1;
        if (salary > otherEmployee.salary) return 1;
        return 0;
    }
}


