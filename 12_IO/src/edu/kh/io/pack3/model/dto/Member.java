package edu.kh.io.pack3.model.dto;

import java.io.Serializable;
//Serializable 인터페이스는 추상메서드가 하나도 없다.
// - 상속만 받고 입출력시 직렬화가 가능하다는 의미만 제공
// ---> = 마커 인터페이스(Marker Interface)

public class Member implements Serializable {
	//필드
	private String id;
	private String pw;
	private String name;
	private int age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
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
	public Member() {
		super();
	}
	public Member(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
