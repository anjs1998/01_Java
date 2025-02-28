package com.hw2.model.dto;

public class Tiger extends Animal{

	public Tiger() {
		super();
	}

	public Tiger(String name) {
		super(name);
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("호랑이가 어흥 하며 포효합니다.");
	}
	
}
