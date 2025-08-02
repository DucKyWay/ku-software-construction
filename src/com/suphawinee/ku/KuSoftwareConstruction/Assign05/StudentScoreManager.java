package com.suphawinee.ku.KuSoftwareConstruction.Assign05;
// package ku.cs.swcon

import java.util.HashMap;

public class StudentScoreManager {
    private HashMap<String, Double> nisit;

    public StudentScoreManager() {
        nisit = new HashMap<>();
    }

    public void addOrUpdateScore(String studentId, double score) {
        nisit.put(studentId, score);
    }

    public Double getScore(String studentId) {
        return nisit.get(studentId);
    }

    public void printAllScores() {
        for (HashMap.Entry<String, Double> n : nisit.entrySet()) {
            System.out.println("- " + n.getKey() + ": " + n.getValue());
        }
        // nisit.forEach((key, value) -> System.out.println("- " + key + ": " + value));
    }

    public static void main(String[] args) {
        StudentScoreManager manager = new StudentScoreManager(); 
        manager.addOrUpdateScore("65123456", 82.5); 
        manager.addOrUpdateScore("65123456", 90.0); 
        manager.addOrUpdateScore("65000001", 78.0); 
        System.out.println(manager.getScore("65123456")); 
        manager.printAllScores();
    }
}
