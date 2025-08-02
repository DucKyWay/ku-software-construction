package com.suphawinee.ku.KuSoftwareConstruction.Assign05;
// package ku.cs.swcon

import java.util.HashSet;

public class RegistrationChecker {
    private HashSet<String> registerList;

    public RegistrationChecker() {
        registerList = new HashSet<>();
    }

    public boolean register(String name) {
        if(registerList.contains(name)) {
            return false;
        }
        registerList.add(name);
        return true;
    }

    public void printAllRegistrants() {
        System.out.println("Registered participants:");
        for(String n: registerList) {
            System.out.println("- " + n);
        }
    }

    public static void main(String[] args) {
        RegistrationChecker checker = new RegistrationChecker(); 
        System.out.println(checker.register("Napat")); // true 
        System.out.println(checker.register("Napat")); // false 
        System.out.println(checker.register("Anan"));  // true 
        checker.printAllRegistrants();
    }
}
