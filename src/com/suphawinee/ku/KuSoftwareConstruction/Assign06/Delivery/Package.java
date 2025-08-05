package com.suphawinee.ku.KuSoftwareConstruction.Assign06.Delivery;

public class Package {
    private double weight;
    private String destination;

    public Package(double weight, String destination) {
        this.weight = weight;
        this.destination = destination;
    }

    public double getWeight() {
        return weight;
    }

    public String getDestination() {
        return destination;
    }

    double calculateShippingFee() {
        return 0;
    }
}
