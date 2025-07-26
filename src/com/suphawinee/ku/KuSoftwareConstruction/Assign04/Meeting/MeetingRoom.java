package src.com.suphawinee.ku.KuSoftwareConstruction.Assign04.Meeting;
// package com.organization.booking

public class MeetingRoom {
    private String name;
    private int capacity;
    private boolean hasProjector;

    public MeetingRoom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.hasProjector = false;
    }
    public MeetingRoom(String name, int capacity, boolean hasProjector) {
        this.name = name;
        this.capacity = capacity;
        this.hasProjector = hasProjector;
    }

    public int getCapacity() {
        return capacity;
    }

    boolean canAccommodate(int people) {
        return people <= capacity;
    }

    public void displayInfo() {
        System.out.println("Room: " + name + ", Capacity: " + capacity +
                ", Projector: " + (hasProjector ? "Yes" : "No"));
    }
}
