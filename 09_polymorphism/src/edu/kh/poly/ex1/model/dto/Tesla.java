package edu.kh.poly.ex1.model.dto;

public class Tesla extends Car { // 전기차
	private int batteryCapacity;

	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	}

	public Tesla(int batteryCapacity) {
		super();
		this.batteryCapacity = batteryCapacity;
	}

	public Tesla() {
		super();
	}

	@Override
	public String toString() {
		return super.toString() + " / " + batteryCapacity; 
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	
}
