package com.suphawinee.ku.KuSoftwareConstruction.AfterMid.Interface.first;

public class Sensor implements NegativeCheckable {
	
	private int sensorID;
	private double temp;
	
	public Sensor(int sensorID, double temp) {
		this.sensorID = sensorID;
		this.temp = temp;
	}
	
	public int getID() {
		return sensorID;
	}
	
	public double getTemp() {
		return temp;
	}
	
	@Override
	public double getValue() {
		return temp;
	}
}
