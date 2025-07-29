package com.suphawinee.ku.KuSoftwareConstruction.Assign04.Meeting;
// package com.organization.booking

public class BookingManager {
    private MeetingRoom room1 = new MeetingRoom("Large Room", 11);
    private MeetingRoom room2 = new MeetingRoom("Dozen Room", 12);
    private MeetingRoom room3 = new MeetingRoom("Extra Large Room", 13);

    public MeetingRoom findSuitableRoom(int people) {
        if (room1.canAccommodate(people)) {
            return room1;
        } else if (room2.canAccommodate(people)) {
            return room2;
        } else if (room3.canAccommodate(people)) {
            return room3;
        } else {
            return null;
        }
    }
    public static void main (String[]args){
        BookingManager bm = new BookingManager();
        int people = 12;
        MeetingRoom result = bm.findSuitableRoom(people);
        if (result != null) {
            System.out.println("Best room for " + people + " people:");
            result.displayInfo();
        } else {
            System.out.println("No suitable room found.");
        }
    }
}