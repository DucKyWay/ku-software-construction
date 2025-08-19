package com.suphawinee.ku.KuSoftwareConstruction.BeforeMid.Assign06.Course;

public class CourseTest {
    public static void main(String[] args) { 
        Course c1 = new GeneralCourse("GE101", "English Communication"); 
        Course c2 = new GeneralCourse("GE102", "Thai Civilization"); 
        Course c3 = new LabCourse("CS103L", "Programming Lab"); 
 
        System.out.println(c1.getInfo()); 
        System.out.println(c2.getInfo()); 
        System.out.println(c3.getInfo()); 
 
        System.out.println("จำนวนวิชาทั้งหมดที่เปิดสอน: " + Course.courseCount); 
    } 
} 