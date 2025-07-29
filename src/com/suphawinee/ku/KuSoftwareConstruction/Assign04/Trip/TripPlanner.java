package com.suphawinee.ku.KuSoftwareConstruction.Assign04.Trip;
//package com.travel.costing;

public class TripPlanner {
    public Trip planTrip(String from, String to, double distanceKm) {
        return new Trip(from, to, distanceKm);
    }
    public static void main(String[] args) {
        TripPlanner planner = new TripPlanner();
        Trip trip = planner.planTrip("Bangkok", "Hua Hin", 180.0);
        trip.displayTripSummary();
    }
}