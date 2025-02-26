package edu.kh.poly.ex2.dto;

public class Person extends Animal {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println("숟가락, 젓가락 등 도구를 이용하여 먹는다.");
		
	}

	@Override
	public void breath() {
		System.out.println("코와 입으로 숨쉰다");
		
	}

	@Override
	public void move() {
		System.out.println("두 발로 걷는다");
	}

	public Person() {
		super();
	}

	public Person(String type, String eatType) {
		super(type, eatType);
	}

	@Override
	public String toString() {
		return "Person :" + super.toString() + " / " + name;
	}
	
}
