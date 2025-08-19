package com.suphawinee.ku.KuSoftwareConstruction.BeforeMid.Assign06.Course;

public class LabCourse extends Course{
    public LabCourse(String courseCode, String title) {
        super(courseCode, title);
    }

    public int getCreditHour() {
        return 1;
    }
}
