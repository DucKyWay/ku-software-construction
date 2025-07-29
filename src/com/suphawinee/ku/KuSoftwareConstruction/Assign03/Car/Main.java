package com.suphawinee.ku.KuSoftwareConstruction.Assign03.Car;

public class Main {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();

        Car car1 = factory.produceCar("Civic", "Red");
        Car car2 = factory.produceCar("Accord", "Blue");

        System.out.println("Total cars produced: " + factory.getTotalCarProduced());
        System.out.println("VIN of car1: " + car1.getVin());
        System.out.println("VIN of car2: " + car2.getVin());
    }
}