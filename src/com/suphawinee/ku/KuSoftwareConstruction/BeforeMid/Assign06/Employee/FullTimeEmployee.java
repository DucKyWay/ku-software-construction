package com.suphawinee.ku.KuSoftwareConstruction.BeforeMid.Assign06.Employee;
// package ku.cs.swcon;

public class FullTimeEmployee extends Employee {
    private String position;
    private int experienceYears;
    
    public FullTimeEmployee(String name, String pos, int exp) {
        this.name = name;
        this.position = pos;
        this.experienceYears = exp;
    }

    public double calculateSalary() {
        int baseSalary;
        if(position.equals("Manager")) {
            baseSalary = 50000;
        } else if(position.equals("Developer")) {
            baseSalary = 35000;
        } else if(position.equals("Tester")) {
            baseSalary = 30000;
        } else {
            baseSalary = 25000;
        }
        return (double) (baseSalary + (baseSalary * 0.03 * experienceYears));
    }

    public void printInfo() {
        System.out.printf("Full-Time Employee: %s, Position: %s, Experience: %d years\n", name, position, experienceYears);
        System.out.printf("Salary: %.1f\n\n", calculateSalary());
    }
}
