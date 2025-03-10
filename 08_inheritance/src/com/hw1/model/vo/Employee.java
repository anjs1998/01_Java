package com.hw1.model.vo;

public class Employee extends Person{
	private int salary;
	private String dept;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name, age, height, weight);
		this.salary = salary;
		this.dept = dept;
	}
	public Employee() {
		super();
	}
	
	@Override
	public String information() {
		return super.information() + " / 급여 : " + salary + " / 부서 : " + dept ;
		
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", dept=" + dept + "]";
	}
	
	
}
