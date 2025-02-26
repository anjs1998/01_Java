package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem {
	private Employee[] employees;
	private int employeeCount = 0;
	
	public Company(int size) {
		this.employees = new Employee[size];
		
	}

	@Override
	public void addPerson(Person person) {
		if(employeeCount < 11) { 
			if(person instanceof Employee) { employees[employeeCount] = (Employee)person;
			employeeCount++;}
		} else {
			System.out.println("최대인원 초과!!");
		}
		
		
		
	}

	@Override
	public void removePerson(String id) {
		for(int i = 0; i < employeeCount; i++) {
			if(employees[i].equals(id)) {
				Employee temp = employees[i];
				employees[i] = employees[employeeCount - 1];
				employees[9] = temp;
				
				//employees[9] = new Employee();
				employeeCount--;
				System.out.println("직원이 삭제되엇습니다." + temp.getInfo());
				return;
			}
			
		}
		System.out.println("해당 id를 가진 인원을 찾을수 없습니다.");
		
	}

	@Override
	public void displayAllPersons() {
		for(int i = 0; i < employeeCount; i++) {
			System.out.println(employees[i].getInfo());
		}
		
	}
	
	
}
