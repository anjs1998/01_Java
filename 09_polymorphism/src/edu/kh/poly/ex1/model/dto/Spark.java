package edu.kh.poly.ex1.model.dto;

public class Spark extends Car{
	private double discountOffer;

	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}

	public Spark(String engine, String fuel, int wheel, double discountOffer) {
		super(engine, fuel, wheel);
		this.discountOffer = discountOffer;
	}

	public Spark(double discountOffer) {
		super();
		this.discountOffer = discountOffer;
	}

	public Spark() {
		super();
	}

	@Override
	public String toString() {
		return super.toString() + " / " + discountOffer;
	}
	
}
