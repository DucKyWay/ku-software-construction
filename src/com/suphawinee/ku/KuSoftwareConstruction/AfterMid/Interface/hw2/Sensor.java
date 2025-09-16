package com.suphawinee.ku.KuSoftwareConstruction.AfterMid.Interface.hw2;

class Sensor implements Comparable<Sensor> {
    private String id;
    private double temperature;

    public Sensor(String id, double temperature) {
        this.id = id;
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public int compareTo(Sensor other) {
    	// น้อย -> มาก
        return Double.compare(this.temperature, other.temperature);
    }

    @Override
    public String toString() {
        return "Sensor{id='" + id + "', temp=" + temperature + "}";
    }
}