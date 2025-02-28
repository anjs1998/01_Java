package com.hw2.model.dto;

public abstract class Animal {
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal() {
		super();
	}

	public Animal(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	
	public abstract void sound();
}
