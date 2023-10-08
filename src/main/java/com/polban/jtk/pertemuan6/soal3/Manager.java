/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polban.jtk.pertemuan6.soal3;

/**
 *
 * @author USER
 */
public class Manager extends Employee {
    private String secretaryName;

    public Manager(String n, double s, int day, int month, int year) {
        super(n, s, day, month, year);
        secretaryName = "";
    }

    public String getSecretaryName() {
        return secretaryName;
    }

    @Override
    public int compare(Sortable b) {
        if (b instanceof Manager) {
            Manager mb = (Manager) b;
            if (this.compareSalary(mb) < 0) return -1;
            if (this.compareSalary(mb) > 0) return 1;
            return 0;
        }
        return 0; // Handle the case where 'b' is not a Manager, e.g., by returning 0.
    }

    private int compareSalary(Manager otherManager) {
        if (this.getSalary() < otherManager.getSalary()) return -1;
        if (this.getSalary() > otherManager.getSalary()) return 1;
        return 0;
    }
}

