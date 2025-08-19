package com.suphawinee.ku.KuSoftwareConstruction.BeforeMid.Assign05;
// package ku.cs.swcon

public class EmployeeAgeAnalyzer {
    public static void analyzeAges(int[] ages) {
        int minimum = ages[0];
        int maximum = ages[0];
        int summ = 0;
        
        for(int i = 0; i < ages.length; i++) {
            summ += ages[i];
            if(ages[i] > maximum) { maximum = ages[i]; }
            if(ages[i] < minimum) { minimum = ages[i]; }
        }
        
        double average = (double)summ / (double)(ages.length);
        System.out.printf("Average: %.1f\nMinimum age: %d\nMaximum age: %d", average, minimum, maximum);
    }

    public static void main(String[] args) {
        int[] ages = {25, 30, 45, 22, 41, 35, 29, 50, 31, 28}; 
        EmployeeAgeAnalyzer.analyzeAges(ages);
    }
}

