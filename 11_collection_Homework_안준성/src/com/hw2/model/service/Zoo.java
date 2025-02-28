package com.hw2.model.service;

import java.util.List;

import com.hw2.model.dto.Animal;

public class Zoo {
	private List<Animal> animals;

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	public Zoo() {
		super();
	}
	public void addAnimal(Animal animal) { this.animals.add(animal);}
	public void showAnimals() {
		for(Animal a : animals)
			a.sound();
	}
	public void displayMenu() {
		
		System.out.println(" ****** KH동물원 ****** ");
		System.out.println("원하는 작업을 선택하세요:");
		System.out.println("1. 동물들의 울음소리를 듣기");
		System.out.println("2. 종료");
		System.out.println("선택 : ");
	}
	
}
