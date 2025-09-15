package com.suphawinee.ku.KuSoftwareConstruction.AfterMid.Interface.second;

public class Test2 {
    public static void main(String[] args) {

        Sensor[] sensors = {
            new Sensor("S1", 37.2),
            new Sensor("S2", 29.5),
            new Sensor("S3", 41.0)
        };

        System.out.println("Before sorting Sensors:");
        for (Sensor s : sensors) {
            System.out.println(s);
        }

        SuphawineeSorter.sort(sensors);

        System.out.println("\nAfter sorting Sensors:");
        for (Sensor s : sensors) {
            System.out.println(s);
        }

        CreditCard[] cards = {
            new CreditCard("1111-2222", 15000.0),
            new CreditCard("3333-4444", 5000.0),
            new CreditCard("5555-6666", 20000.0)
        };

        System.out.println("\nBefore sorting CreditCards:");
        for (CreditCard c : cards) {
            System.out.println(c);
        }

        SuphawineeSorter.sort(cards);

        System.out.println("\nAfter sorting CreditCards:");
        for (CreditCard c : cards) {
            System.out.println(c);
        }
    }
}
