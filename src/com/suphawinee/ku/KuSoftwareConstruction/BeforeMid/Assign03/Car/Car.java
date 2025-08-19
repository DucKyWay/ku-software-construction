package com.suphawinee.ku.KuSoftwareConstruction.BeforeMid.Assign03.Car;

public class Car {
    private String model;
    private String color;
    private final String vin;
    static int totalCarProduced;

    Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.vin = generateVin();
    }

    public static int getTotalCarProduced() {
        return totalCarProduced;
    }

    private String generateVin() {
        return "1HGCM82633A" + String.format("%06d", totalCarProduced);
    }

    public String getVin() {
        return vin;
    }
}
