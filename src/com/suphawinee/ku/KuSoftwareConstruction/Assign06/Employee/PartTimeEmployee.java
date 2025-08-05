package com.suphawinee.ku.KuSoftwareConstruction.Assign06.Employee;
// package ku.cs.swcon;

public class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private double hoursWorked;

    public PartTimeEmployee(String name, double hrsRate, double hrsWork) {
        this.name = name;
        this.hourlyRate = hrsRate;
        this.hoursWorked = hrsWork;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public void printInfo() {
        System.out.printf("Part-Time Employee: %s\n", name);
        System.out.printf("Salary: %.1f\n\n", calculateSalary());
    }
}
