package com.suphawinee.ku.KuSoftwareConstruction.BeforeMid.Assign05;
// package ku.cs.swcon

import java.util.ArrayList;

public class ClassroomManager {
    private ArrayList<String> studentList;

    public ClassroomManager() {
        studentList = new ArrayList<>();
    }
    
    public void addStudent(String name) {
        if(name != null && !name.isBlank()) { 
            studentList.add(name);
        }
    }

    public void removeStudent(String name) {
        studentList.remove(name);
    }

    public void printStudents() {
        for(int i = 0; i < studentList.size(); i++) {
            System.out.println((i+1) + ". " + studentList.get(i));
        }
    }

    public static void main(String[] args) {
        ClassroomManager room = new ClassroomManager();
        room.addStudent("Somchai"); 
        room.addStudent("Suda"); 
        room.removeStudent("Somchai"); 
        room.printStudents();
    }
}
