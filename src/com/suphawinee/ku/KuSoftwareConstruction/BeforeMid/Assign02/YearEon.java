package com.suphawinee.ku.KuSoftwareConstruction.BeforeMid.Assign02;

public class YearEon {
    public static double yearToEon (int year){
        return year/1000000000d; // 1000000000d or 1000000000.0
    }
    public static void main(String[] args) {
        System.out.println(yearToEon(1000));
        System.out.println(yearToEon(100));
        System.out.println(yearToEon(1));
    }
}