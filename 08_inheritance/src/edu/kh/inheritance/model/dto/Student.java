package edu.kh.inheritance.model.dto;

public class Student extends Person {
	private String name;
	private int age;
	private int grade;
	private int classRoom;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	public Student() {}
	public Student(String name, int age, String nationality,  int grade, int classRoom) {
		super(name, age, nationality);
		
		this.grade = grade;
		this.classRoom = classRoom;
	}
	//자식인 Student 에서 this 참조변수를 이용해 직접 접근 불가.
	//=부모의 고유필드 접근불가
	//대신 setter를 이용할수는 잇음. -> 비효율적이라서 대신 super()를 사용할수 있음.
	@Override
	public String toString() {
		return super.toString() + " / " + grade + " / " + classRoom;
	}
	
	
	
}
