package com.suphawinee.ku.KuSoftwareConstruction.BeforeMid.Assign03.Car;

public class CarFactory {
    public Car produceCar(String model, String color) {
        ++Car.totalCarProduced;
        return new Car(model, color);
    }

    public int getTotalCarProduced() {
        return Car.getTotalCarProduced();
    }
}
