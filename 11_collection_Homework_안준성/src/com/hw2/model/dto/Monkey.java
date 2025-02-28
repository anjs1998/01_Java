package com.hw2.model.dto;

public class Monkey extends Animal{

	
	public Monkey() {
		super();
	}
	public Monkey(String name) {
		super(name);
	}


	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("원숭이가 우끼끼하며 소리를 냅니다.");
	}
	
}
