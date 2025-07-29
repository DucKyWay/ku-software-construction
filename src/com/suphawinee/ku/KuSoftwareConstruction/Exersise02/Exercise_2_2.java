package com.suphawinee.ku.KuSoftwareConstruction.Exersise02; // Idea
//package com.suphawinee.ku.KuSoftwareConstruction; // Eclipse

import java.util.Scanner;

public class Exercise_2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Quantity: ");
        int num = in.nextInt();

// ------------------------------------------------------------------------

        double total = num * 100;
        if(total >= 10000)      System.out.println(total * 0.7);
        else if(total >= 1000)  System.out.println(total * 0.9);

    }
}

/*
เขียนโปรแกรมคำนวณรำคำสุทธิสำหรับร้ำนค้ำแห่งหนึ่ง โดยมีข้อกำหนดว่ำสินค้ำแต่ละชิ้นมีมูลค่ำ 100 บำท และ
- หำกมูลค่ำรวมที่ลูกค้ำซื้อมำกกว่ำหรือเท่ำกับ 1000 บำท จะลดรำคำ 10%
- หำกมูลค่ำรวมที่ลูกค้ำซื้อมำกกว่ำหรือเท่ำกับ 10000 บำท จะลดรำคำ 30%
 */