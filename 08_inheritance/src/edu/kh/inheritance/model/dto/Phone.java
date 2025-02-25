package edu.kh.inheritance.model.dto;

public class Phone {
	private String brand;
	private String model;
	private int year;
	private int price;
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Phone() {
		super();
	}

	public Phone(String brand, String model, int year, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Brand: " + brand + "\nModel: " + model + "\nYear: " + year + "\nPrice: " + price ;
	}

	public void printInfo() {
		System.out.println(this.toString());
	}
}
