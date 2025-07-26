package src.com.suphawinee.ku.KuSoftwareConstruction.Assign04.Trip;
//package com.travel.costing;

public class Trip {
    private String from;
    private String to;
    private double distanceKm;
    private double baseFare;

    public Trip(String from, String to, double distanceKm) {
        this.from = from;
        this.to = to;
        this.distanceKm = distanceKm;
    }

    public double calculateFare() {
        if(distanceKm <= 100) {
            baseFare = distanceKm * 5;
            return baseFare;
        } else {
            baseFare = (100 * 5) + ((distanceKm - 100) * 3.5);
            return baseFare;
        }
    }

    public void displayTripSummary() {
        System.out.printf("Trip from %s to %s (%.2f km)\n", from, to, distanceKm);
        System.out.printf("Total Fare: %.2f Baht\n", calculateFare());
    }

}
