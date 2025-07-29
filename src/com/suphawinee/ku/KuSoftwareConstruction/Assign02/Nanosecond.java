package com.suphawinee.ku.KuSoftwareConstruction.Assign02;

public class Nanosecond {
    public static long minToNanoSec(int min){
        long nanoSec = (long) min *60*1_000_000_000;
        return (nanoSec);
    }
    public static void main(String[] args) {
        System.out.println(minToNanoSec(0));
        System.out.println(minToNanoSec(1));
        System.out.println(minToNanoSec(10));
    }
}
