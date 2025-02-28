package com.hw2.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;
import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Zoo zoo = new Zoo();
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Tiger());
		animals.add(new Monkey());
		zoo.setAnimals(animals);
		int menu = 2;
		do {
			zoo.displayMenu();
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				zoo.showAnimals(); break;
			case 2: 
				System.out.println("프로그램을 종료합니다."); break;
			default :
				System.out.println("유효한 숫자가 아닙니다.");
			
			}
			
		}while(menu == 1);
	}
}
