package com.suphawinee.ku.KuSoftwareConstruction.AfterMid.Interface.first;

public class Test1 {
    public static void main(String[] args) {
        
    	Sensor[] sensors = {
            new Sensor(1, -20), new Sensor(2, 32), new Sensor(3, -15)
        };

        CreditCard[] cards = {
            new CreditCard("Emma", 300),
            new CreditCard("Chris", 100),
            new CreditCard("Joey", -50)
        };

        System.out.println("Negative Sensors = " + StatUtil.countNegative(sensors)); // 2
        System.out.println("Negative CreditCards = " + StatUtil.countNegative(cards)); // 1
    }
}
