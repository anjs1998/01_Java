package com.hw2.model.dto;

public class Prisoner extends Person{
	private String crime;

	public String getCrime() {
		return crime;
	}

	public void setCrime(String crime) {
		this.crime = crime;
	}

	public Prisoner(String id, String name, String crime) {
		super(id, name);
		this.crime = crime;
	}
	public String getInfo() {
		// TODO Auto-generated method stub
		return "ID : " + id +" , 이름 : " + name + " , 죄목 : " + crime;
	}
	
}
