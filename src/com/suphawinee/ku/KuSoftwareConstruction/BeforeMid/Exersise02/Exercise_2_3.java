package com.suphawinee.ku.KuSoftwareConstruction.BeforeMid.Exersise02;

import java.util.Scanner;

public class Exercise_2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1st number: ");
        int num1 = in.nextInt();
        System.out.print("2nd number: ");
        int num2 = in.nextInt();
        System.out.print("3rd number: ");
        int num3 = in.nextInt();

        // ----------------------------------------------

        if(num1 > num2 && num1 > num3)
            System.out.println(num1 + " is the most.");
        else if(num2 > num1 && num2 > num3)
            System.out.println(num2 + " is the most.");
        else if(num3 > num1 && num3 > num2)
            System.out.println(num3 + " is the most.");
    }
}

/*
เขียนโปรแกรมเพื่อรับ input int จำก user 3 ค่ำ แสดงค่ำที่มำกที่สุด ให้ใช้ if / if -else เท่ำนั้นs
 */