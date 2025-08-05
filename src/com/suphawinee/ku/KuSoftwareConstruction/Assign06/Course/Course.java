package com.suphawinee.ku.KuSoftwareConstruction.Assign06.Course;

abstract class Course {
    private final String courseCode;
    private String title;
    public static int courseCount;

    public Course(String courseCode, String title) {
        this.courseCode = courseCode;
        this.title = title;
        courseCount++;
    }

    abstract int getCreditHour();

    public String getInfo() {
        return String.format("%s - %s ( %d หน่วยกิต)", courseCode, title, getCreditHour());
    }
}
