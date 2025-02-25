package edu.kh.inheritance.model.dto;

public class BasicPhone extends Phone {
	private boolean hasPhysicalKeyboard;

	public boolean isHasPhysicalKeyboard() {
		return hasPhysicalKeyboard;
	}

	public void setHasPhysicalKeyboard(boolean hasPhysicalKeyboard) {
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}

	public BasicPhone() {
		super();
	}

	public BasicPhone(String brand, String model, int year, int price, boolean hasPhysicalKeyboard) {
		super(brand, model, year, price);
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}
	@Override
	public void printInfo() { 
		System.out.println(super.toString());  
		checkKeyboard();
	}
	
	@Override
	public String toString() {
		return "BasicPhone [hasPhysicalKeyboard=" + hasPhysicalKeyboard + "]";
	}

	public void checkKeyboard() {System.out.println(this.hasPhysicalKeyboard?"이 휴대폰은 물리적 키보드가 있습니다." : "이 휴대폰은 물리적 키보드가 없습니다.");}
	
}
