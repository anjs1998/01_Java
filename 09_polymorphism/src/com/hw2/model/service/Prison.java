package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{
	private Prisoner[] prisoners = new Prisoner[10];
	private int prisonerCount = 0;
	public Prisoner[] getPrisoners() {
		return prisoners;
	}
	public void setPrisoners(Prisoner[] prisoners) {
		this.prisoners = prisoners;
	}
	public int getPrisonerCount() {
		return prisonerCount;
	}
	public void setPrisonerCount(int prisonerCount) {
		this.prisonerCount = prisonerCount;
	}
	public Prison(int size) {
		super();
		prisoners = new Prisoner[size];
	}
	@Override
	public void addPerson(Person person) {
		if(prisonerCount < 11) { 
			if(person instanceof Employee) { prisoners[prisonerCount] = (Prisoner)person;
			prisonerCount++;}
		
		} else {
			System.out.println("최대인원 초과!!");
		}
		
		
		
	}

	@Override
	public void removePerson(String id) {
		for(int i = 0; i < prisonerCount; i++) {
			if(prisoners[i].equals(id)) {
				Prisoner temp = prisoners[i];
				prisoners[i] = prisoners[prisonerCount - 1];
				prisoners[9] = temp;
				
				//employees[9] = new Employee();
				prisonerCount--;
				System.out.println("직원이 삭제되엇습니다." + temp.getInfo());
				return;
			}
			
		}
		System.out.println("해당 id를 가진 인원을 찾을수 없습니다.");
		
	}

	@Override
	public void displayAllPersons() {
		for(int i = 0; i < prisonerCount; i++) {
			System.out.println(prisoners[i].getInfo());
		}
		
	}
	
}
